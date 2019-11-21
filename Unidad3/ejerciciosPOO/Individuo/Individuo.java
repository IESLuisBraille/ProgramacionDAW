
public class Individuo {
	
	public String dni;
	public String nombre;
	public int fechaNacimiento;
	public static int poblacion;
	public final double PI = 3.14d;
	
	

	public Individuo(String dni, String nombre, int fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		poblacion++; //Al ser de tipo entero se asume que partirá de valor 0
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public static int getPoblacion() {
		return poblacion;
	}

	public static void setPoblacion(int poblacion) {
		Individuo.poblacion = poblacion;
	}


	

}
