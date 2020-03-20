package examen2trimprog;
import java.util.Scanner;

public class Ejercicio3 {
	public static double[][] setMatrix(int n){
		
		if ( n < 3)
			throw new IllegalArgumentException();
		
		double [][] m = new double[n][n];
		for (int i = 0; i < n; i++)
			for(int j = 0; j < n; j++) {
				m[i][j] = (int)(Math.random() * 10);
			}
		return m;
	}
	
	public static void getMatrix(double[][] m) {
		for(int i = 0; i < m.length; i++) {
			for( int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	public static double getMedia2DSec(double[][] m) {
		System.out.println("Cálculo media secundaria: ");
		double media = 0.0;
		for (int i = 0; i <= m.length; i++) 
				
				for(int j = 0 ; j <= m.length; j++) {
					
					if (i+j == m.length -1) {
						System.out.print(m[i][j]+" ");
						media += m[i][j];
					}
					
		}
		return media/m.length;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// TODO Auto-generated method stub
		/*
		 *    00  01  02  03
		 *    10  11  12  13
		 *    20  21  22  23
		 *    30  31  32  33
		 * 
		 * */
		
		System.out.println("Introduzca la dimensión n x n: ");
		int dim = sc.nextInt();
		double[][] auxm = setMatrix(dim);
		getMatrix(auxm);
		System.out.printf("Media es %.2f: ", getMedia2DSec(auxm));
		
		
	
				
		
		

	}

}
