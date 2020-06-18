package extraordinaria.programacion;

import java.util.*;
//Using an array of fixed size
public class OperacionesArray {
	//global variables
	public static int taman , capacidad ;
	public static String [] listaNombres ;
	public static Scanner sc ;
	//main
	public static void main ( String [] args )
	{
		configurar() ;
		run() ;
	}
	//initial set up
	public static void configurar ()
	{
		sc = new Scanner ( System . in ) ;
		System.out.print ( " Introducir tamaño : " ) ;
		capacidad = Integer .parseInt ( sc.nextLine () ) ;
		listaNombres = new String [ capacidad ];
		taman = 0;
	}
	//action
	public static void run ()
	{
	char c ;
		do {
			System . out . print (" A ( ñadir ) , E( liminar ) , Im(P)rimir , B ( uscar ) , I(nsertar), S ( alir ) : " ) ;
			c = ( sc.nextLine() ).charAt(0) ;
		switch ( c ) {
			case 'A':
					System . out . println (" Introducir nuevos nombres , línea en blanco para finalizar : " ) ;
					String name ;
					do
					{
						System.out.print ( " > " ) ;
						name = sc . nextLine () ;
						if ( name.length () != 0 )
						{
							add(name) ;
						}
					} while ( name.length () != 0 ) ;
					break ;
			case 'E':
					System.out.print ( " Introduce la posición a eliminar : " ) ;
					eliminar ( Integer.parseInt ( sc.nextLine () ) ) ;
					break ;
					case 'B':
						System . out . print ( " Introduce un elemento a buscar : " ) ;
						buscar ( sc.nextLine () ) ;
					break ;
			case 'P':
					imprimir() ;
					break;
			case 'I':
				    System.out.println("Introduzca el item a insertar: ");
				    String item = sc.nextLine();
				    System.out.println("Introduzca el lugar a insertar: ");
				    String n = sc.nextLine();
				    String temp[] = new String[listaNombres.length + 1];
				    temp = insertar( listaNombres, Integer.parseInt(n), item);
				    for (int i = 0; i < temp.length; i++)
				    	System.out.println(" " +  temp[i]);
				    
			}
		} while ( c != 'S' ) ;
		System . out . println ( " Saliendo ... " ) ;
	}
	//method for searching
	public static void buscar ( String aName )
	{
		boolean found = false ;
		for ( int pos = 0; pos < taman ; pos ++ ) {
			if ( listaNombres [ pos ].indexOf( aName ) >= 0 ) {
				found = true ;
				System.out.printf ("Encontrado en %04d in %s \n " , pos , listaNombres [ pos ] ) ;
			}
		}
		if ( ! found ) {
			System.out.println ( " No encontrado " ) ;
		}
	}
	//method for printing data
	public static void imprimir ()
	{
		for ( int pos = 0; pos < taman ; pos ++ ) {
			System.out.printf ( " %04d :%s %n " , pos , listaNombres[ pos ] ) ;
		}
	}
		//method for insertion
	
	public static void add ( String aName ) {
		if ( taman < capacidad ) {
			listaNombres [ taman ++ ] = aName ;
		}
		else{
			System.out.println ( " El almacenamiento está lleno (array lleno) . " ) ;
		}
	}
		//method for removal
	
	public static void eliminar ( int index ) {
		if ( index >= 0 && index < taman ) {
			listaNombres [ index ] = listaNombres [ -- taman ];
		}
		else {
			System.out.println ( " La posición especificada no existe . " ) ;
		}
	}
	
	public static String [] insertar ( String [] ar , int target , String w )
	{
		String [] temp = new String [ ar . length + 1 ];
		for ( int pos = 0; pos < target ; pos ++ )
		{
			temp [ pos ] = ar [ pos ];
		}
			temp [ target ] = w ;
		for ( int pos = target ; pos < ar . length ; pos ++ )
		{
			temp [ pos + 1 ] = ar [ pos ];
		}
		return temp ;
	}


}

