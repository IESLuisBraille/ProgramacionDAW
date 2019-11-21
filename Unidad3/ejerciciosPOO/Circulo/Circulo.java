public class Circulo
{
	//Constante
	public static final double PI = 3.141592;

	//Miembro Dato
	private double radio;
	
	//Constructores
	public Circulo(double radio)
	{
		this.radio = radio;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public Circulo()
	{
		radio = 2;
	}
		
	////////////////////////////////////////////////////////////////////////////
	
	public double calcularSuperficie()
	{
		return radio * radio * PI;
		
		//Otra forma de cálculo, más precisa sería usando la propiedad PI de la clase Math:
		//return radio * radio * Math.PI;
	}
}//Fin Class