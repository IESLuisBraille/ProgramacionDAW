package cajero;

//	Account.java
//	Represents a bank account

public class Cuenta {
	private int numCuenta; // número cuenta
	private int pin;
	private double balanceDisponible; // dinero disponible para sacar
	private double balanceTotal; // dinero disponible para sacar + pendiente de depósitos

	// Se inicializan atributos
	public Cuenta(int numCuenta, int pin, double balanceDisponible, double balanceTotal) {
		this.numCuenta = numCuenta;
		this.pin = pin;
		this.balanceDisponible = balanceDisponible;
		this.balanceTotal = balanceTotal;
	}

	// determina si un usuario con cuenta le conicide el pin
	public boolean validarPin(int pinUsuario) {
		if (pinUsuario == pin)
			return true;
		else
			return false;
	}

	public double getBalanceDisponible() {
		return balanceDisponible;
	}

	public double getBalanceTotal() {
		return balanceTotal;
	}

	// suma al balance total
	public void credito(double cantidad) {
		balanceTotal += cantidad;
	}

	// resta a ambos balances total y disponible
	public void debito(double cantidad) {
		balanceDisponible -= cantidad;
		balanceTotal -= cantidad;
	}

	public int getNumCuenta() {
		return numCuenta;
	}
}
