package cajero;

import java.util.Scanner;

public class Deposito extends Transaccion {
	private double cantidad;
	private boolean sobreRecibido;
	private final static int CANCELED = 0; // cancelar opción

	// constructor que llama a la super clase
	public Deposito(int userAccountNumber, BaseDatosBanco atmBankDatabase) {
		// inicializa variables de la superclase
		super(userAccountNumber, atmBankDatabase);

	}

	@Override
	public void ejecutar() {
		BaseDatosBanco bankDatabase = getBddBanco(); // referencia a la base de datos de banco

		cantidad = imprimirParaCantidadDeposito(); // cantidad depósito del usuario

		if (cantidad != CANCELED) {
			/*
			 * Aquí se introduce la cantidad y se realiza el proceso de entrada del sobre Es
			 * suficiente con poner Sí ó No
			 */
			System.out.print("\nPor favor introduzca la cantidad a depositar en un sobre: ");
			System.out.printf("%.2f", cantidad);
			System.out.print(".");
			System.out.println("Introducido sobre? S / N: ");
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			if (c == 's' || c == 'S')
				sobreRecibido = true;
			else if (c == 'n' || c == 'N')
				sobreRecibido = false;

			// ver si se ha recibido el sobre
			if (sobreRecibido) {
				System.out.print("\nSu sobre ha sido " + "recibido.\nNOTA: El dinero sólo ha sido depositado "
						+ "estará disponible cuando se verifique la cantidad " + "del sobre adjunto.");

				// si es así le pasamos la cantidad al credito de la cuenta
				bankDatabase.credito(getNumCuenta(), cantidad);
			} else {
				System.out.print("\nNo insertó el sobre " + "por lo que la operación ha sido cancelada por el cajero.");
			}
		} else {
			System.out.print("\nCancelando transacción...");
		}
	}

	// El usuario introduce el depósito
	private double imprimirParaCantidadDeposito() {

		System.out.print("\nPor favor, intruduzca una cantidad a depositar en " + "€ (o pulse 0 para cancelar): ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // recibimos la cantidad del depósito

		// vemos si se ha cancelado
		if (input == CANCELED)
			return CANCELED;
		else {
			return (double) input; // retornamos la cantidad
		}
	}
}
