/*
*
* @author ()
*/
public class Ejercicio070305RectanguloCopiaBien{
	public static void main(String[] args) {
		Punto p  = new Punto(1.1,2.2);
		Rectangulo MiRectangulo = new Rectangulo( p , new Punto(3.3 , 4.4 ) );
		Rectangulo NvoRectangulo = new Rectangulo( MiRectangulo );
		System.out.println("Mi Rectángulo queda : " + MiRectangulo );
		System.out.println("Mi NvoRectángulo queda : " + NvoRectangulo );
		double desplazamiento = 7.0;
		System.out.println("Ejemplo de Mal Uso : "  +desplazamiento + " desplazado solo a MiRectangulo :");
		MiRectangulo.desplazarDerecha(desplazamiento);
		System.out.println("Mi Rectángulo queda : " + MiRectangulo );
		System.out.println("Mi NvoRectángulo queda : " + NvoRectangulo );
	}
}
