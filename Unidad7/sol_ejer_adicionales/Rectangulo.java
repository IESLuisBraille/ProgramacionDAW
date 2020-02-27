/**
 *
 * @author ()
 */
public class Rectangulo {

	private Punto supizq;
	private Punto infder;

	private void ajusta(){
		//Metodo que ajusta los vertices del rectángulo.
		//Dos nvos ptos temporales con los datos.
		Punto temp1 = new Punto(supizq);
		Punto temp2 = new Punto(infder);
		//Se reaustan los datos del rectangulo.
		supizq.setX( Double.min(temp1.getX(), temp2.getX()) );
		supizq.setY( Double.max(temp1.getY(), temp2.getY()) );
		infder.setX( Double.max(temp1.getX(), temp2.getX()) );
		infder.setY( Double.min(temp1.getY(), temp2.getY()) );
	}
	public Rectangulo(Rectangulo r){ //BIEN
		this.supizq = new Punto (r.supizq);
		this.infder = new Punto (r.infder);
		ajusta();//Por si acaso.
	}
	public Rectangulo(Punto psupizq, Punto pinfder) {//Bien
		this.supizq = new Punto(psupizq);
		this.infder = new Punto(pinfder);
		ajusta(); //Ajustamos los vertices.
	}

	public Rectangulo(double x1, double y1, double x2, double y2){
		supizq = new Punto(x1,y1);
		infder = new Punto(x2,y2);
		ajusta();
	}

	public Rectangulo(){
		supizq = new Punto(0,0);
		infder = new Punto(0,0);
		ajusta();//Por si acaso.
	}

	@Override
	public String toString() {
		String retorno = "(" + supizq.toString() + "->" + infder.toString()+ ")";
		return retorno;
	}

	public double area(){
		double alto  = supizq.getY() - infder.getY();
		double ancho = infder.getX() - supizq.getX();
		return alto*ancho;
	}
	public double perimetro(){
		double alto  = supizq.getY() - infder.getY();
		double ancho = infder.getX() - infder.getX();
		return 2*alto+2*ancho;
	}
	public Punto getVerticeSupIzq(){
// Utilizando el constructor copia de Punto (si es que está definido)
		Punto p = new Punto(this.supizq); // Uso del constructor copia
		return p;
	}
	public Punto getVerticeInfDer(){
// Utilizando el constructor copia de Punto (si es que está definido)
		Punto p = new Punto(this.infder); // Uso del constructor copia
		return p;
	}
	public Punto getVerticeSupDer(){
	// Utilizando el constructor Punto
	//X de supizq e Y de infder.
		Punto p = new Punto( infder.getX() , supizq.getY() );
		return p;
	}
	public Punto getVerticeInfIzq(){
// Utilizando el constructor Punto
//X de supizq e Y de infder.
		Punto p = new Punto( supizq.getX() , infder.getY() );
		return p;
	}
	public void setVerticeSupIzq( Punto nvoVertice ){
		// Movemos el Vertice Sup Izq a una nvaposición.
		supizq.setX( nvoVertice.getX() );
		supizq.setY( nvoVertice.getY() );
		//Se hace uso de los métodos de la clase Punto.
		ajusta();//Reajustar los Vértices por si fuera necesario.
	}
	public void desplazarDerecha( double cantidad ){
		//Desplaza el Rect a la dcha una cantidad
		supizq.setX( cantidad+supizq.getX() );
		infder.setX( cantidad+infder.getX() );
		ajusta();
	}
}