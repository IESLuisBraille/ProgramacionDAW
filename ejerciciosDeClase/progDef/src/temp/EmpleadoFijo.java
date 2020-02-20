package temp;

public class EmpleadoFijo extends Empleado {

	 @Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		this.salario = this.salario + 100;
	}
	
    public static void main(String[] args) {
		EmpleadoFijo e1 = new EmpleadoFijo();
		System.out.println(e1.salario);
		e1.calcularSalario();
		System.out.println(e1.salario);
	}
}
