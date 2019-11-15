package Pajaro;

public class UsoPajaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Instanciamos la clase Pajaro para crear el objeto loro
		Pajaro loro = new Pajaro("loro", 100, 200);
		
		//Podemos acceder a los atributos de instancia de loro que ahora es un objeto y sus campos y métodos se basan en Pajaro
		System.out.println(loro.nombre+ " "+loro.posX+" "+loro.posY);
		
		//Podemos imprimir el campo nombre, llamar a la función loro.volar(10,20) y luego imprimir posX y posY.
		
		System.out.printf("El %s ha volado %f y está en la posición %d,%d \n", loro.nombre, loro.volar(10, 20), loro.posX,loro.posY);

	}

}
