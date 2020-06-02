package prog;

import java.util.Arrays;

public class Ejercicio2 {
	
	
	//Para ordenar filas
	public static String[] ordenaFila(String[] s) {
		
		String temp = "";
		int n = s.length;
		
        for (int j = 0; j < n - 1; j++) 
        { 
            for (int i = j + 1; i < n; i++)  
            { 
                if (s[j].compareToIgnoreCase(s[i]) > 0) 
                { 
                    temp = s[j]; 
                    s[j] = s[i]; 
                    s[i] = temp; 
                } 
            } 
        } 
		
		return s;
	}
	
	/*
	 * Ordena una matriz 
	 */
	public static String[][] ordenaMatrizFilas(String[][] m){
		
		String[] m1 = new String[m.length]; // se hace una fila
		
		String[] filaOrdenada = new String[m.length]; // fila ordenada actual
		
		String[][] mFilasOrd = new String[m.length][m[0].length]; //matriz ordenada por filas
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m1[j] = m[i][j];
			}
		 
		filaOrdenada = ordenaFila(m1);
		for (int k = 0; k < mFilasOrd.length; k++)
			mFilasOrd[i][k] = filaOrdenada[k];
		
		}
		
		return mFilasOrd;
		
	}
	
	public static void imprimeMatrizAleatoria(String[][] m) {
		
       String[] fila = new String[m.length];
       
       for (int j = 0; j < m.length; j++) {
    	 
    	   for (int p = 0; p < m[j].length; p++) {
    		   fila[p] = m[j][p];
    	   }
		 
			for (int k = 0; k < fila.length; k++) {
			
				for (int i = 0; i < fila.length; i++) {
					int indiceIntercambioAleatorio = (int) (Math.random() * fila.length);
					String temp = fila[indiceIntercambioAleatorio];
					fila[indiceIntercambioAleatorio] = fila[i];
					fila[i] = temp;
				}
				
		    }
			for (int i = 0; i < fila.length; i++)
				System.out.print(" " +fila[i]);
			System.out.println();
			
       }

				
	}
	
	public static void imprimeMatriz(String [][] m) {
		for ( int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++)
				System.out.print(" " +  m[i][j]);
		System.out.println();
		}
	}
	
	/**
	 * 
	 * 00 01 02 03 04
	 * 10 11 12 13 14
	 * 20 21 22 23 24
	 * 30 31 32 33 34
	 * 40 41 42 43 44
	 */
	
	public static void diagonalTriangularBaja(String[][] m) { 
		int i, j; 
		for (i = 0; i < m.length; i++) 
		{ 
		    for (j = 0; j < m[0].length; j++) 
		    { 
		        if (i < j) 
		        { 
		            System.out.print("*" + "  "); 
		        } 
		        else
		        System.out.print(m[i][j] + " "); 
		    } 
		    System.out.println(); 
		} 
	} 
	
	public static void diagonalTriangularAlta(String[][] m) { 
		int i, j; 
		for (i = 0; i < m.length; i++) 
		{ 
		    for (j = 0; j < m[0].length; j++) 
		    { 
		        if (i > j) 
		        { 
		            System.out.print("*" + "  "); 
		        } 
		        else
		        System.out.print(m[i][j] + " "); 
		    } 
		    System.out.println(); 
		} 
	} 
	
	public static void main(String[] args) {

		String[][] m = { {"ab", "fg", "sT" ,"DD","aa"},
				         {"zz", "hi", "ba", "AE","Mn"},
				         {"gK", "AC", "BA", "AF", "AA"},
				         {"CC", "lT", "FA", "GH", "DA"},
				         {"ZM", "sF", "oP", "mK", "am"}
		};
		
	
		System.out.println("*************Matriz normal: ********\n");
		imprimeMatriz(m);
		System.out.println("*************Matriz Aleatoria: ********\n");
		imprimeMatrizAleatoria(m);
		System.out.println("*************Matriz Ordenada Por filas: ********\n");
		imprimeMatriz(ordenaMatrizFilas(m));
		System.out.println("*************Matriz Diagonal Abajo: ********\n");
		diagonalTriangularBaja(ordenaMatrizFilas(m));
		System.out.println("*************Matriz Diagonal Arriba: ********\n");
		diagonalTriangularAlta(ordenaMatrizFilas(m));
		
		
		

	}

}
