package progdef.unidad7.herencia;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 * @author Firstname Lastname {@literal <address@example.com>}
 * @version 1.6 (current version number of program)
 * @since 1.2 (the version of the package this class was first added to)
 */ 
abstract public class Persona implements Cloneable {

	protected String nombre;
	String apellidos;
	GregorianCalendar fechaNacim;

	abstract public void imprime();
	
	public final void mostrar() {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
		String strFecha = formatoFecha.format(this.fechaNacim.getTime());
		System.out.printf("Nombre: %s\n", this.nombre);
		System.out.printf("Apellidos: %s\n", this.apellidos);
		System.out.printf("Fecha de nacimiento: %s\n", strFecha);
	}

	public Persona(String str) {
		System.out.println("Soy una persona" + str);
	}

	public Persona() {
	}

	protected String getNombre() {
		return nombre;
	}

	protected final void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected String getApellidos(String str) {
		return str;
	}

	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	protected GregorianCalendar getFechaNacim() {
		return fechaNacim;
	}

	protected void setFechaNacim(GregorianCalendar fechaNacim) {
		this.fechaNacim = fechaNacim;
	}

	/**
	 * <b>Short one line description. (1)</b>
	 * <p>
	 * Longer description. If there were any, it would be (2) here.
	 * </p>
	 * And even more explanations to follow in consecutive paragraphs separated by
	 * HTML paragraph breaks.
	 * 
	 * @param obj objeto tipo Object
	 * {@link #mostrar()}
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Persona) {
			Persona tmpPersona = (Persona) obj;
			if (this.nombre.equals(tmpPersona.nombre) && this.apellidos.equals(tmpPersona.apellidos)
					&& this.fechaNacim.equals(tmpPersona.fechaNacim)) {
				return true;
			}

			else {
				return false;
			}

		} else {
			return false;
		}
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
//		Persona pers1 = new Persona();
//		GregorianCalendar cal1 = new GregorianCalendar(2020, 1, 17);
//		pers1.setNombre("Bruce");
//		pers1.setApellidos("Lee");
//		pers1.setFechaNacim(cal1);
//		Persona pers2 = new Persona();
//		pers2.setNombre("Marvin");
//		pers2.setApellidos("Lee");
//		System.out.println(pers1.equals(pers2));
//		//pers1.mostrar();
//		
////		Object o = new Object();
////		
////		
//		Persona pers3 = new Persona();  
//		pers3 = (Persona) pers1.clone();
//		System.out.println(pers1.equals(pers3));
//		
////		
////		 
////		System.out.println(pers2.apellidos + "\n" 
////										+ pers1.getNombre() + "\n"
////										+ pers1.hashCode()
////										+ "\n"
////										+ pers2.hashCode()
////										+ pers2.equals(pers1));
	}
}
