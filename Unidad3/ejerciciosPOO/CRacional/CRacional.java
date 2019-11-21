public class CRacional
{
	private int numerador;
  	private int denominador;
  	
  	//Constructor
  	public CRacional(int numerador, int denominador)
  	{
  		this.numerador = numerador;
  		this.denominador = denominador;
  	}
  	
  	////////////////////////////////////////////////////////////////////////////
  	
  	public CRacional()
  	{
  	}
  	
  	////////////////////////////////////////////////////////////////////////////
  
  
  	
  	public void visualizarRacional()
  	{
    	System.out.println(numerador + "/" + denominador);
  	}
}
