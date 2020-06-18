package extraordinaria.programacion.ejercicio4;

public class TartaFitness extends Item {
	
	private String tipo; // si es una tarta de chocolate
	private double precio = 0.0;
	private String mensaje;
	
	public TartaFitness(String tipo, double precio, String mensaje) {
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
		this.precio = precio;
		this.mensaje = mensaje;
		
	}

	@Override
	double calcularCoste() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	String describirItem() {
		// TODO Auto-generated method stub
		return this.tipo + "Mensaje: " + this.mensaje;
		
	}

	@Override
	String getTipo() {
		// TODO Auto-generated method stub
		return this.tipo;
	}

}
