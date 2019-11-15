package ejerciciosPOO;

public class Pajaro {

	//Atributos o Miembros de clase. También llamado Campos
	String nombre; 
	int posX;
	int posY; 
	
	//Constructur por defecto. Los constructuroes no tienen ni void ni ningún tipo de retorno. _Siempre es public y tiene el nombre
	//idéntico al de la clase. Tampoco lleva argumentos ni tampoco código en su interior.
	
	public Pajaro() {
		
	}
	
	//Constructor con tres argumentos que se pasan para asignar valores a los campos o atributos.
	
	public Pajaro(String nom, int x, int y) {
		
		nombre = nom;
		posX = x;
		posY = y;
	}
	
	/* Método volar que calcula la nueva posición de vuelo por el paso de x e y y actualizando los campos posX y posY
	 * Se calcula la posición mediante una fórmula y se retorna del resultado.
	
	*/
	public double volar(int x, int y) {
		
		double desplazamiento = Math.sqrt(x*x + y*y);
		posX = x;
		posY = y;
		
		return desplazamiento;
	
	}
}
