/** Alumno
 *
 * @author ()
 */

public class Alumno extends Persona{
	protected String grupo;
	protected double notaMedia;
	public Alumno(){
		super();
		grupo = new String("");
		notaMedia = 0.;
	}
	public Alumno( Alumno A ){
		//Paso de parametros a la clase base.
		super( A.getNombre() , A.getApellidos() , A.getFechaNacim() );
		//super( (Persona) A ); //Alternativa con Casting.
		grupo = new String( A.getGrupo() );
		notaMedia = A.getNotaMedia();
	}
	public Alumno(String pNombre, String pApellidos, int pAno, int pMes, int pDia, String pGrupo, double pMedia){
		super( pNombre, pApellidos, pAno, pMes, pDia);
		grupo = new String(pGrupo);
		notaMedia = pMedia;
	}
	public String getGrupo(){
		return new String(grupo);
	}
	public double getNotaMedia(){
		return notaMedia;
	}
	public void setGrupo(String grupo){
		this.grupo = new String(grupo);
	}
	public void setNotaMedia(double notaMedia){
		this.notaMedia = notaMedia;
	}
	@Override
	public String toString(){
		String cadena = super.toString();
		return cadena + " Grupo : "	+ getGrupo() + ", Media : "	+ getNotaMedia() ;
	}
	@Override
	// Código que añadimos a la clase Alumno. 
	//Sobreescritura del método equals en Alumno.class.
	public boolean equals( Object obj ){
		if( obj instanceof Alumno ){
			//Primero que lo pasado sea de la clase Alumno.
			if( super.equals( (Persona) obj ) != true ){
				//Si no son la misma persona entonces es falso.
				return false;
			}else{
				//Condiciones propias de la clase Alumno
				return this.grupo.equalsIgnoreCase(
					//Transformamos obj en Alumno : Casting.
					//Se comparan las Especialidades de ambos Objetos
					//Además se usa IgnoreCase.
					((Alumno) obj).getGrupo()
				);
			}
		}else{
			//Si no era un objeto de la Clase Profesor es falso.
			return false; 
		}
	}// Cierre del método equals Alumno.
}
