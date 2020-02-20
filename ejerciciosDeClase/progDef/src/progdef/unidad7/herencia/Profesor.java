package progdef.unidad7.herencia;

import java.util.GregorianCalendar;
import java.awt.Component;

public class Profesor extends Persona{

	String especialidad;
	double salario;
	
	public Profesor() {
		super("Profesor"); 
		//this("otro mensaje");
		//System.out.println("Constructor 1");
		
	}
	
	public Profesor(String msg) {
		
		System.out.println("Constructor con mensaje "+ msg);
	}
	
	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	public void mostrar(String str, int i) {}
	
	public void mostrar(int i, String str) {}
	
	public static void main(String[] args) {
		Profesor prof1 = new Profesor();
		GregorianCalendar cal1 = new GregorianCalendar(2020, 1, 17);
		prof1.setNombre("profersor2");
		prof1.setApellidos("apellidos2");
		prof1.setFechaNacim(cal1);
		prof1.setEspecialidad("ADE");
		prof1.setSalario(900.0);
		prof1.mostrar();
		
	}

	@Override
	public void imprime() {
		// TODO Auto-generated method stub
		System.out.println("Soy profesor");
	}
}
