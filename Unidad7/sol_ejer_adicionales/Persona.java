/** Persona
 *
 * @author ()
 */

import java.util.Calendar;
import java.util.Date;

public class Persona {
	protected String nombre;
	protected String apellidos;
	protected Calendar fechaNacim;
	public Persona(){
		setNombre("");
		setApellidos("");
		fechaNacim = Calendar.getInstance();
		fechaNacim.set(2000,0,1);//Meses de 0 a 11. ¡¡CUIDADO!!.
	}
	public Persona( Persona P ){
		setNombre(P.getNombre());
		setApellidos(P.getApellidos());
		fechaNacim = Calendar.getInstance();
		fechaNacim.set(P.fechaNacim.get( Calendar.YEAR ),
			P.fechaNacim.get( Calendar.MONTH ), 
			P.fechaNacim.get( Calendar.DAY_OF_MONTH ) );
	}
	public Persona(String pNombre, String pApellidos, Calendar pFechaNacim){
		setNombre(pNombre);
		setApellidos(pApellidos);
		fechaNacim = Calendar.getInstance();
		fechaNacim.set(
			pFechaNacim.get(Calendar.YEAR),
			pFechaNacim.get(Calendar.MONTH), 
			pFechaNacim.get(Calendar.DAY_OF_MONTH)
		);
	}
	public Persona(String pNombre, String pApellidos, String pFechaNacim){
		setNombre(pNombre);
		setApellidos(pApellidos);
		Date d = new Date(pFechaNacim);
			//Calendar c = new GregorianCalendar(); 
		fechaNacim = Calendar.getInstance();
		fechaNacim.setTime(d);
	}
	public Persona(String pNombre, String pApellidos, int pAno, int pMes, int pDia){
		setNombre(pNombre);
		setApellidos(pApellidos);
		fechaNacim = Calendar.getInstance();
		fechaNacim.set(pAno,pMes,pDia);
	}
	public String getNombre (){
		return new String(nombre);
	}
	public String getApellidos (){
		return new String(apellidos);
	}
	public Calendar getFechaNacim(){
		Calendar nuevo = Calendar.getInstance();
		nuevo.set(fechaNacim.get(Calendar.YEAR),
			fechaNacim.get(Calendar.MONTH), 
			fechaNacim.get(Calendar.DAY_OF_MONTH) );
		return nuevo;
	}
	public void setNombre(String nombre){
		this.nombre = new String(nombre);
	}
	public void setApellidos(String apellidos){
		this.apellidos = new String(apellidos);
	}
	public void setFechaNacim(Calendar fechaNacim){
		this.fechaNacim = fechaNacim;
	}
	@Override
	public String toString(){
		String cadena = nombre + " " + apellidos;
		return cadena + " (" + fechaNacim.get(Calendar.YEAR)+ "/"+ fechaNacim.get(Calendar.MONTH)+ "/"+fechaNacim.get(Calendar.DATE)+ ")";
	}
	@Override
	// Código que añadimos a la clase Persona. Sobreescritura del método equals.
	public boolean equals(Object obj) {
		if (obj instanceof Persona) {
			 Persona tmpPersona = (Persona) obj;
			if( this.nombre.equals(tmpPersona.nombre) &&
					this.apellidos.equals(tmpPersona.apellidos) &&
					this.fechaNacim.equals( tmpPersona.fechaNacim ) ){
				return true;
			}
			else{ return false; }
		}else{ return false; }
	} //Cierre del método equals
}
