/**
 * Ejercicio 3

 * 
 */

/**
 *  Introduce la longitud : 5
 Introduce elemento en  0 : 1
 Introduce elemento en  1 : 2
 Introduce elemento en  2 : 3
 Introduce elemento en  3 : 4
 Introduce elemento en  4 : 5
    1    3    6   10   15
    0    2    5    9   14
    0    0    3    7   12
    0    0    0    4    9
    0    0    0    0    5
 Introduce la longitud : 
 * 
 */
package extraordinaria.programacion;

import java.io.*;
import java.util.*;

// computer all partials sums of an array
public class SumasParcialesMatriz {
	// read an array from a given scanner
	public static int [] leerMatriz () {
		Scanner sc = new Scanner ( System . in ) ;
		System . out . print ( " Introduce la longitud : " ) ;
		int len = sc . nextInt () ;
		int [] numeros = new int [ len ];
		for ( int pos = 0; pos < len ; pos ++ ) {
			System . out . printf ( " Introduce elemento en % d : " , pos ) ;
			numeros [ pos ] = sc . nextInt () ;
		}
		return numeros;
	}
	//compute the partial sums of an input array
	public static int [][] parciales ( int [] unaDim ) {
	int [][] dosDim = new int [ unaDim . length ][ unaDim . length ];
	
		for ( int filaPos = 0; filaPos < unaDim . length ; filaPos ++ ){
			dosDim[filaPos][filaPos] = unaDim[filaPos];
				for ( int colPos = filaPos + 1; colPos < unaDim.length; colPos++ ) {
					dosDim[filaPos][colPos] = dosDim[filaPos][colPos - 1 ] + unaDim [colPos];
				}
		}
	return dosDim;
	}
	
	//-- print
	public static void print ( int [][] dosDim ) {
		for ( int filaPos = 0; filaPos < dosDim.length ; filaPos ++ ) {
			for ( int colPos = 0; colPos < dosDim.length; colPos ++ ) {
				System.out.printf( "%5d" , dosDim[filaPos][colPos] ) ;
			}
		System.out.println() ;
		}
	}
	//-- main
	public static void main ( String [] args ) {
		int [] a = leerMatriz () ;
		int [][] sumas = parciales ( a ) ;
		print ( sumas ) ;
	    print ( parciales ( leerMatriz () ) ) ;
	}
}


