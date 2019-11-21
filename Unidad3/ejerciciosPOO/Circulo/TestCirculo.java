class TestCirculo
{
	public static void main(String args[])
	{
		//Instanciamos o Creamos un Circulo de Radio = 5
		Circulo circulito = new Circulo(5.0);
		
		//Mensaje para Obtener el Area
		System.out.println("El Area del primer círculo, de radio = 5 es: " + circulito.calcularSuperficie());
		
		Circulo minicirculito = new Circulo();
		System.out.println("El Area del segundo círculo es: " + minicirculito.calcularSuperficie());
	}
}