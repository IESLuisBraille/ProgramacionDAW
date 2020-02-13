package unidad7;

public class Rectangle {

	
	private Punto vertix1 = new Punto();
	private Punto vertix2 = new Punto();
	
	/**
	 * 
	 * Este método resuelve el problema de efecto colateral
	 * 
	 */
//	Punto getV1() {
//		Punto aux = new Punto();
//		aux.setX(vertix1.getX());
//		aux.setY(vertix1.getY());
//		return aux;
//	}
	
	/**
	 * Métodos con problemas en métodos colaterales
	 * 
	 */
	Punto getV1() {
		return this.vertix1;
	}
//	
	Punto getV2() {
		return this.vertix2;
	}
	
	void setV1(double x, double y) {
		vertix1.setX(x);
		vertix1.setY(y);
	}
	void setV2(double x, double y) {
		vertix2.setX(x);
		vertix2.setY(y);
	}
	
	

	public Rectangle(double x1, double y1, double x2, double y2) { 
		vertix1.setX(x1);
		vertix1.setY(y1);
		vertix2.setX(x2);
		vertix2.setY(y2);
		
	}
	
	/**
	 * Constructor con problemas de efectos colaterales
	 * 
	 * 
	 */
	public Rectangle(Punto v1, Punto v2) {
		vertix1 = v1;
		vertix2 = v2;
	}
	

	/**
	 * Constructor sin efectos colaterales
	 * 
	 */
	
//	public Rectangle(Punto v1, Punto v2) {
//		
//		vertix1 = new Punto(v1.getX(), v2.getY());
//		vertix2 = new Punto(v2.getX(), v2.getY());
//	}
	
	
	@Override
	public String toString() {

		return String.format("Vértice x1: %f Vértice y1: %f" , this.vertix1.getX(), this.vertix1.getY());
	}
}
