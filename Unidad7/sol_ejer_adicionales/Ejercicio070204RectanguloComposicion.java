/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objeto r de la clase punto
        Punto p  = new Punto(1.4,5.2);
        //objeto q de la clase punto
        Punto q  = new Punto(3.3,9.4);
        //objeto r compuesto por los puntos q y r
        Rectangulo r = new Rectangulo(p,q);

        System.out.println( r.toString() ); //toString se puede omitir.

    }

}
