package temp;

public abstract class Empleado {
	
	protected double salario;
	
	public Empleado() {
		this.salario = 1000;
	}
	
	abstract public void calcularSalario();

}
