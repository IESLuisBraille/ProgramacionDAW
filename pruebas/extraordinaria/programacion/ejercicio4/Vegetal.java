package extraordinaria.programacion.ejercicio4;

public class Vegetal extends Item {

	private double preciokg;
	private double cantidad;
	private String descrip;
	private String tipo = "Vegetal";
	
	public Vegetal( double preciokg, double cantidad, String descrip) {
		this.cantidad = cantidad;
		this.preciokg = preciokg;
		this.descrip = descrip;
		
	}
	double calcularCoste() {
		return preciokg * cantidad;
	}
	String describirItem() { 
		return String.format("El producto es: %s", this.descrip); 
	
	}
	
	public String getTipo() { return this.tipo; }
	

}
