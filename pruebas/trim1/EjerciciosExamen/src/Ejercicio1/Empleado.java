package Ejercicio1;

public class Empleado {

	//Constantes
	private static final int productividadA = 10;
	private static final int productividadB = 11;
	private static final int productividadC = 12;
	
	private static final int nivel_junior = 20;
	private static final int nivel_lider = 21;
	private static final int nivel_arquictecto = 22;
	
	private static final double sueldo_base = 900.0;
	
	// Campos Miembro
	private int edad;
	private String nombre;
	private int productividad;
	private int nivel;
	private double sueldo = 0.0;
	
	
	
	public Empleado(String nombre, int edad, int productividad, int nivel) {
		
		if (productividad < 10 || productividad > 12) {
			System.out.println("Error en Campo Productividad (10,11,12)");
			System.exit(1);
		}
		
		if (nivel < 10 || nivel > 22) {
			System.out.println("Error en nivel de experiencia (20,21,22)");
			System.exit(1);
		}
		
		this.nombre = nombre;
		this.edad = edad;
		this.productividad= productividad;
		this.nivel = nivel;
		
	}
	
	public void calcularSueldo() {
		
		switch (this.productividad) {
		
			case 10: this.sueldo += 200.0 + this.sueldo_base; break;
			case 11: this.sueldo += 400.0 + this.sueldo_base; break;
			case 12: this.sueldo += 700.0 + this.sueldo_base; break;
		}
		
		switch (this.nivel){
			case 20: this.sueldo += (0.10 * this.sueldo_base); break;
			case 21: this.sueldo += (0.25 * this.sueldo_base); break;
			case 22: this.sueldo += (0.50 * this.sueldo_base); break;
			
		}
	}
	
	public double getSueldo() {
		return this.sueldo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	


	
	
	
	
}
