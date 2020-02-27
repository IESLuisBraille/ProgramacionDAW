/** Profesor
 *
 * @author ()
 */
public class Profesor extends Persona {
	String especialidad;
	double salario; //No está definido en Persona.
	public Profesor(){
		super();
		especialidad = new String("");
		salario = 0.;
	}
	public Profesor(String pNombre, String pApellidos, int pAno, int pMes, int pDia, String pEspecialidad, double pSalario){
		super( pNombre, pApellidos, pAno, pMes, pDia);
		especialidad = new String(pEspecialidad);
		salario = pSalario;
	}
	public Profesor( Profesor Profe ){
		//Paso de parametros a la clase base.
		super( Profe.getNombre() , Profe.getApellidos() , Profe.getFechaNacim() );
		//super( (Persona) Profe ); //Alternativa con Casting.
		especialidad = new String(Profe.getEspecialidad());
		salario = Profe.getSalario();
	}
	public double getSalario(){
		return salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public String getEspecialidad(){
		return new String(especialidad);
	}
	public void setEspecialidad(String especialidad){
		this.especialidad = new String(especialidad);
	}
	public double getSueldo(){
		//En Profesor coincide el Sueldo con el Salario pq no hay Suplementos.
		return getSalario();
	}
	@Override
	public String toString(){
		String cadena = super.toString();
		return cadena + " Especialidad : "	+ getEspecialidad() + ", Salario : "	+ getSueldo() ;
	}
	@Override
	// Código que añadimos a la clase Profesor.
	//Sobreescritura del método equals en Profesor.class.
	public boolean equals( Object obj ){
		if( obj instanceof Profesor ){
			//Primero que lo pasado sea de la clase Profesor.
			if( super.equals( (Persona) obj ) != true ){
				//Si no son la misma persona entonces es falso.
				return false;
			}else{
				//Condiciones propias de la clase Profesor
				return this.especialidad.equalsIgnoreCase(
					//Transformamos obj en Profesor : Casting.
					//Se comparan las ESpecialidades de ambos Objetos
					//Además se usa IgnoreCase.
					((Profesor) obj).getEspecialidad()
				);
			}
		}else{
			//Si no era un objeto de la Clase Profesor es falso.
			return false;
		}
	}// Cierre del método equals Profesor.
}
