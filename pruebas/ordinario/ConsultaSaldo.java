package cajero;

public class ConsultaSaldo extends Transaccion {
	public ConsultaSaldo(int numCuentaUsuario, BaseDatosBanco bddCajeroBanco) {
		super(numCuentaUsuario, bddCajeroBanco);
	}

	// Aquí se hace la transacción
	@Override
	public void ejecutar() {
		// tiene la referencia de la base de datos de banco.
		BaseDatosBanco bddBanco = getBddBanco();

		// consigue el balance disponible para la cuenta que lo solicita
		double balanceDisponible = bddBanco.getBalanceDisponible(getNumCuenta());

		// consigue el balance total par ala cuenta que lo solicita
		double totalBalance = bddBanco.getBalanceTotal(getNumCuenta());

		// muestra la información del balance
		System.out.println("\n Información de balance: ");
		System.out.println(" - Balance disponible");
		System.out.printf("$%,.2f", balanceDisponible);
		System.out.println("\n - Total balance:     ");
		System.out.printf("$%,.2f", totalBalance);

	}
}
