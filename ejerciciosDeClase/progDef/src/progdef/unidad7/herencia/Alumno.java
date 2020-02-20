package progdef.unidad7.herencia;

public class Alumno extends Persona{

	String grupo;
	double notaMedia;
	
	@Override
	protected String getApellidos() {
		return "Alumno: " + apellidos;
	}
	
	
	@Override
	protected String getApellidos(String str) {
		// TODO Auto-generated method stub
		return str;
	}
//	
//	@Override
//	protected String getNombre() {
//		return "Alumno " + this.nombre;
//	}
	
	public Alumno() {
		this("otro mensaje ",14);
		System.out.println("Constructor 1 ");
	}
	
	public Alumno(String msg, int a) {
		
		System.out.println("Constructor 2 " +  msg + a);
	}
	
	
	protected String getGrupo() {
		return grupo;
	}

	protected void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	protected double getNotaMedia() {
		return notaMedia;
	}
 
	protected void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public static void main(String[] args) {
		Alumno alu1 = new Alumno();
//		alu1.setNombre("alu1");
//		alu1.setApellidos("aluape1");
//		System.out.println(alu1.getNombre()+ alu1.getApellidos());
	}


	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Soy Alumno");
	}
}
