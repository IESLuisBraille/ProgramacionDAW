package cajero;


public abstract class Transaccion
{
	private int numCuenta;	
	private BaseDatosBanco bddBanco;
	
	
	public Transaccion(int numCuentaUsuario,
			BaseDatosBanco bddCajeroBanco)
	{
		numCuenta = numCuentaUsuario;
	
		bddBanco = bddCajeroBanco;
	}	
	
	public int getNumCuenta()
	{
		return numCuenta;
	}	
		

	public BaseDatosBanco getBddBanco()
	{
		return bddBanco;
	}	
	
	
	abstract public void ejecutar();
}
