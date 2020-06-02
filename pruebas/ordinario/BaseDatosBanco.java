package cajero;

//	Es la base de datos del banco, donde se almacenan las cuentas.

public class BaseDatosBanco {
	private Cuenta[] cuentas; // array de cuentas

	public BaseDatosBanco() {
		cuentas = new Cuenta[2];
		cuentas[0] = new Cuenta(11444, 1111, 200.0, 400.0);
		cuentas[1] = new Cuenta(22333, 2222, 200.0, 200.0);
	}

	private Cuenta getCuenta(int numCuenta) {
		// buscamos el número de cuenta
		for (Cuenta cuentaCorriente : cuentas) {
			// si la encontramos la retornamos
			if (cuentaCorriente.getNumCuenta() == numCuenta)
				return cuentaCorriente;
		}

		return null; // si no se encuentra se retorna un null
	}

	/*
	 * Aquí se va a verificar si el usuario con una cuenta el pin coincide con la
	 * pantalla de login.
	 */
	public boolean autenticarUsuario(int numCuentaUsuario, int pinUsuario) {
		// primero verificamos si existe cuenta
		Cuenta cuentaUsuario = getCuenta(numCuentaUsuario);

		// si existe, validamos el pin, si no, se retorna un false
		if (cuentaUsuario != null)
			return cuentaUsuario.validarPin(pinUsuario);
		else
			return false;
	}

	// retornar el balance disponible
	public double getBalanceDisponible(int numCuentaUsuario) {
		return getCuenta(numCuentaUsuario).getBalanceDisponible();
	}

	// retornar el balance total
	public double getBalanceTotal(int numCuentaUsuario) {
		return getCuenta(numCuentaUsuario).getBalanceTotal();
	}

	public void credito(int numCuentaUsuario, double cantidad) {
		getCuenta(numCuentaUsuario).credito(cantidad);
	}

	public void debito(int numCuentaUsuario, double cantidad)

	{
		getCuenta(numCuentaUsuario).debito(cantidad);
	}
}
