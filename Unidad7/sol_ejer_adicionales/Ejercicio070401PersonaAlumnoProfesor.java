/*
*
* @author ()
*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ejercicio070401PersonaAlumnoProfesor{
	public static void main(String[] args) {
		System.out.printf("Salida del Ejercicio : %s =="
			+ "========\n" , "Ejercicio070401PersonaAlumnoProfesor" );
		Persona P	= new Persona();
		System.out.println("Persona Vacía : " + P );

		Calendar fecha = Calendar.getInstance();
		fecha.set(1990,10,1); //Meses de 0 a 11, ¡¡CUIDADo!!...
		Persona P2 = new Persona("Pepe","Perez Jimenez", fecha);
		System.out.println("Persona : " + P2 );
		Persona P3 = new Persona("Juan","Gómez López", "1992/08/08");
		System.out.println("Persona : " + P3 );
		Persona P4 = new Persona("Luis","Gonzalez Pérez", 1997 , 10 , 10);
		System.out.println("Persona : " + P4 );

		Alumno A1 = new Alumno("Ana","López López", 1995 , 5 , 5, "DAI1" , 7.5);
		System.out.println("Alumno : " + A1 );

		Profesor Profe1 = new Profesor("Maria","Perez Perez", 1980 , 6 , 6, "Mates" , 1000.);
		System.out.println("Profe1 : " + Profe1 );
		Profesor Profe2 = new Profesor(Profe1);
		System.out.println("Profe2 : " + Profe2 );
		Profesor Profe3 = new Profesor("Maria","Perez Perez", 1980 , 6 , 6, "Fisica" , 1000.);
		System.out.println("Profe3 : " + Profe3 );

		System.out.println("Ejemplos de equals=============================" );
		System.out.printf("Profe1 equals Profe2 %b\n", Profe1.equals(Profe2) );
		System.out.printf("#Profe1 == #Profe2 %b ->", Profe1 == Profe2 ); //¿Misma Dirección de memoria?
		System.out.printf(" Profe1(%X) , Profe3(%X)\n", Profe1.hashCode() , Profe3.hashCode() );
			//hashCode() trans en entero la dir de mem del Objeto
			//https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#hashCode--
		System.out.printf("Profe1 equals Profe3 %b\n", Profe1.equals(Profe3) );
		System.out.printf("Ana equals Ana %b\n", new Alumno(A1).equals( new Alumno(A1) ) );
		System.out.println("Ejemplos de Fechas=============================" );
		/*De
			https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html
			https://docs.oracle.com/javase/7/docs/api/java/util/GregorianCalendar.html
			http://www.w3api.com/wiki/Java:GregorianCalendar
			https://www.lawebdelprogramador.com/codigo/Java/2299-Ejemplo-de-la-utilizacion-de-la-clase-Calendar.html
			¿Pq GregorianCalendar y método getinstance? : http://sce.uhcl.edu/yang/teaching/AbstractGetInstanceTest/AbstractGetInstanceTest.htm
			A partir de Java 8 se recomiendan otras clases de gestion de tiempo en el Package java.time
		*/
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		//Calendar c = new GregorianCalendar();
			//Es lo mismo.
			//Calendar no se puede instanciar por ser Abstracta.
		c.setTime(d);
		String dia, mes, annio, hora, minuto, segundo;
		dia = Integer.toString(c.get(GregorianCalendar.DATE));
		mes = Integer.toString(c.get(GregorianCalendar.MONTH));
		annio = Integer.toString(c.get(GregorianCalendar.YEAR));
		hora = Integer.toString(c.get(GregorianCalendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(GregorianCalendar.MINUTE));
		segundo = Integer.toString(c.get(GregorianCalendar.SECOND));
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
		Date d2 = new Date("2019/12/01");
		c.setTime(d2);
		dia = Integer.toString(c.get(GregorianCalendar.DATE));
		mes = Integer.toString(c.get(GregorianCalendar.MONTH)); //De 0 a 11 ¡¡CUIDADO!!
		annio = Integer.toString(c.get(GregorianCalendar.YEAR));
		hora = Integer.toString(c.get(GregorianCalendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(GregorianCalendar.MINUTE));
		segundo = Integer.toString(c.get(GregorianCalendar.SECOND));
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
		Date d3 = new Date( System.currentTimeMillis() );
		c.setTime(d3);
		dia = Integer.toString(c.get(GregorianCalendar.DATE));
		mes = Integer.toString(c.get(GregorianCalendar.MONTH)); //De 0 a 11 ¡¡CUIDADO!!
		annio = Integer.toString(c.get(GregorianCalendar.YEAR));
		hora = Integer.toString(c.get(GregorianCalendar.HOUR_OF_DAY));
		minuto = Integer.toString(c.get(GregorianCalendar.MINUTE));
		segundo = Integer.toString(c.get(GregorianCalendar.SECOND));
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
		Calendar fechaNva;
		fechaNva = Calendar.getInstance();
		fechaNva.set(1900,10,10);//Meses de 0 a 11. ¡¡CUIDADO!!.
		dia = Integer.toString(fechaNva.get(GregorianCalendar.DATE));
		mes = Integer.toString(fechaNva.get(GregorianCalendar.MONTH)); //De 0 a 11 ¡¡CUIDADO!!
		annio = Integer.toString(fechaNva.get(GregorianCalendar.YEAR));
		hora = Integer.toString(fechaNva.get(GregorianCalendar.HOUR_OF_DAY));
		minuto = Integer.toString(fechaNva.get(GregorianCalendar.MINUTE));
		segundo = Integer.toString(fechaNva.get(GregorianCalendar.SECOND));
		System.out.println (hora + ":" + minuto + ":" + segundo + " " + dia + "/" + mes +"/" + annio);
	}
}
