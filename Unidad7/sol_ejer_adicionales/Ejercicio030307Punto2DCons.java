/**
 * Write a description of class here.
 * @author ()
 * @version ()
 */
public class Ejercicio030307Punto2DCons {
	//Para crear objetos debemos de crearlos dentro del método main
	public static void main(String []args) {
		Punto P = new Punto(1.1,2.2), Q = new Punto(4.7,7.4);
      //Constructores desde coordenadas.
    Punto Centro = new Punto();
      //Constructor por defecto. Asigna (0,0).
    
		System.out.printf("Punto P : Coordenadas (%3.1f , %3.1f). Distancia al centro : %4.2f\n" , P.x , P.y , P.distancia(Centro) );
		System.out.printf("Punto Q : Coordenadas (%3.1f , %3.1f). Distancia al centro : %4.2f\n" , Q.x , Q.y , Q.distancia(Centro) );
		System.out.printf("Punto Centro : Coordenadas (%3.1f , %3.1f). Distancia al centro : %4.2f\n" , Centro.x , Centro.y , Centro.distancia(Centro) );

		//Calculo de la Distancia de P a Q. Por Pitagoras.
		// d = sqrt( (x-x0)2 + (y-y0)2 ); (Se hace con el método distancia en la clase Punto.
		System.out.printf("Distancia P a Q : %3.1f\n", P.distancia(Q) );
    Punto S= new Punto(P);
    System.out.println("Creamos el Punto S como copia de P");
		System.out.printf("Punto S : Coordenadas (%3.1f , %3.1f). Distancia de S a P  : %4.2f\n" , S.x , S.y , S.distancia(P) );
	}
}
