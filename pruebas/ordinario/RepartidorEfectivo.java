package cajero;


public class RepartidorEfectivo 
{
	//	número de billetes ded 20€ que tenemos
	private final static int CUENTA_INICIAL = 2;
	private int contador;	//	bileltes de 20€ que nos quedan
	
	public RepartidorEfectivo()
	{
		contador = CUENTA_INICIAL;	//	configuramos el contador a la cuenta inicial
	}	
	
	//	damos 
	public void darEfectivo(int cantidad)
	{
		int billetesRequeridos = cantidad / 20;	//	número de billetes de 20 requeridos
		contador -= billetesRequeridos;	//	actualizadoms los billetes que quedan
	}	
	
	// indica si el efectivo se puede dar
	public boolean hayEfectivo(int cantidad)
	{
		int billetesRequeridos = cantidad / 20;	//	número de billtess de 20€ requeridos
		
		if (contador >= billetesRequeridos)
			return true;	//	suficientes
		else
			return false;	//	no hay suficientes
	}	
}	
