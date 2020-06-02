package cajero;

import java.util.Scanner;

public class Retiro extends Transaccion {
	private int cantidad;
	private RepartidorEfectivo repartidorEfectivo; // referencia al repartidorEfectivo

	private final static int CANCELADO = 6;

	public Retiro(int numCuentaUsuario, BaseDatosBanco bddCajeroBanco, RepartidorEfectivo repartidorEfectivoCajero) {
		// inicializar las variables de la sueperclase
		super(numCuentaUsuario, bddCajeroBanco);

		// initializar la referencia al repartidorEfectivo
		repartidorEfectivo = repartidorEfectivoCajero;
	}

	// hacer transacción
	@Override
	public void ejecutar() {
		boolean cashRepartido = false; // efectivo aún no reaprtido
		double balanceDisponible; // cantidad disponible para el retiro

		// referencias de la base de datos de bancos.
		BaseDatosBanco bddBanco = getBddBanco();

		// loop hasta que se repartar el efectivo o el usuario cancele
		do {
			// obterne las cantidades
			cantidad = mostrarMenuCantidades();

			// verificar si el usuario eligió retiro o cancelación
			if (cantidad != CANCELADO) {

				balanceDisponible = bddBanco.getBalanceDisponible(getNumCuenta());

				// verificamos que la cantidad es menor que lo que se tiene como disponible

				if (cantidad <= balanceDisponible) {
					// verificamos si hay suficiente efectivo
					if (repartidorEfectivo.hayEfectivo(cantidad)) {
						// actualizamos los balances con el retiro del cajero
						bddBanco.debito(getNumCuenta(), cantidad);

						repartidorEfectivo.darEfectivo(cantidad); // repartimos efectivo
						cashRepartido = true; // repartido

						System.out.print("\nSu efectivo ha sido" + " dispensado. Puede recoger su efectivo.");
					} else // si no, efectivo insuficiente
						System.out.print(
								"\nEfectivo insuficiente en Cajero" + "\n\nPor favor, seleccione una cantidad menor.");
				} else // no hay suficiente dinero en la cuenta de usuario
				{
					System.out.print(
							"\nFondos Insuficientes en su cuenta." + "\n\nPor favor seleccione una cantidad menor.");
				}
			} else {
				System.out.print("\nCancelando transacción...");
				return; // volvemos al menú principal
			}
		} while (!cashRepartido);

	}

	// mostramos un menu del retiro y las opciones
	// se retorna la cantidad elegida ó 0 si el usuario elige cancelar.

	private int mostrarMenuCantidades() {
		int seleccionUsuario = 0; // selección usuario

		// array de cantidades que corresponden la cantidades a sacar. Obsérverse que el índice 0 vale 0€.
		int[] cantidades = { 0, 20, 40, 60, 100, 200 }; 

		while (seleccionUsuario == 0) {
			System.out.println("\nMenú de retiro:");
			System.out.println("1 - 20€");
			System.out.println("2 - 40€");
			System.out.println("3 - 60€");
			System.out.println("4 - 100€");
			System.out.println("5 - 200€");
			System.out.println("6 - Cancelar transacción");

			Scanner sc = new Scanner(System.in);

			int input = sc.nextInt();

			switch (input) {
				case 1: // Aquí lo que se hace es elegir cualquier opción y luego la pasamos
				case 2: // al array de cantidades
				case 3:
				case 4:
				case 5:
					seleccionUsuario = cantidades[input]; // conseguimos las cantidades
					break;
				case CANCELADO: // opción cancelar
					seleccionUsuario = CANCELADO; 
					break;
				default: // otro valor que no sea 1-6
					System.out.println("\nOpción inválida, seleccione otra vez.");
			} 
		} 

		return seleccionUsuario; // devolvermos la cantidad deseada o cancelar.
	} 
} 
