package recuperaciones2t.prog;

import java.util.Scanner;

public class ReconocimientoDePatrones {

	/**
	 * El siguiente código no está optimizado. Se pueden realizar funciones que
	 * hagan más limpio el código La idea principal del algoritmo es establecer un
	 * contador cont que lleve el conteo de hasta 4 consecutivoActual es para
	 * indicar el número actual que se va a acomparar con el resto de filas,
	 * columnas o diagonales.
	 * 
	 */

	public static void main(String[] args) {

		// Matriz prueba para realizar pruebas de entrada, se pueden cambiar los valores
		// para verificar los algoritmos

		int[][] matrix = { 
				
					{ 0, 1, 1, 1, 0 }, 
					{ 1, 0, 1, 0, 1 }, 
					{ 0, 1, 0, 1, 0 }, 
					{ 0, 1, 0, 1, 0 },
				    { 0, 0, 1, 1, 0 }, 
		};

		System.out.println("La matriz: ");
		imprimeMatriz(matrix);
		System.out.println(" tiene 4 consecutivos?: ");

		System.out.println(tieneCuatroConsecutivos(matrix));
	}

	public static boolean tieneCuatroConsecutivos(int[][] matrix) {
		int cont;
		int consecutivoActual;

		/**
		 * 
		 * 00 01 02 03 04 
		 * 10 11 12 13 14 
		 * 20 21 22 23 24 
		 * 30 31 32 33 34
		 */
		// verifica filas
		for (int i = 0; i < matrix.length; i++) {
			cont = 1;
			consecutivoActual = matrix[i][0];
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[i][j];
				}
				if (cont >= 4) {
					return true;
				}
			}
		}

		/**
		 * 
		 * 00 01 02 03 04 
		 * 10 11 12 13 14 
		 * 20 21 22 23 24 
		 * 30 31 32 33 34
		 */

		// verifica las columnas
		for (int i = 0; i < matrix[0].length; i++) {
			cont = 1;
			consecutivoActual = matrix[0][i];
			for (int j = 1; j < matrix.length; j++) {
				if (matrix[j][i] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[j][i];
				}
				if (cont == 4) {
					return true;
				}
			}
		}

		// diagonal principal
		/**
		 * 
		 * 00 01 02 03 04 
		 * 10 11 12 13 14 
		 * 20 21 22 23 24 
		 * 30 31 32 33 34
		 */

		/*
		 * Va de la diagonal principal hacia abajo comprobando todos
		 */

		for (int i = 0; i < matrix.length; i++) {
			cont = 1;
			consecutivoActual = matrix[i][0];
			for (int j = i + 1, k = 1; j < matrix.length && k < matrix[j].length; j++, k++) {
				if (matrix[j][k] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[j][k];
				}
				if (cont == 4) {
					return true;
				}
			}
		}

		/**
		 * 
		 * 00 01 02 03 04 
		 * 10 11 12 13 14 
		 * 20 21 22 23 24 
		 * 30 31 32 33 34
		 * 
		 * 00 01 02 03 
		 * 10 11 12 13 
		 * 20 21 22 23 
		 * 30 31 32 33 
		 * 40 41 42 43
		 * 
		 * 00 01 02 03 04 05 
		 * 10 11 12 13 14 15 
		 * 20 21 22 23 24 25 
		 * 30 31 32 33 34 35 
		 * 40 41 42 43 44 45
		 * 50 51 52 53 54 55
		 */

		/**
		 * Va de la subdiagonal superior, la que está encima de la diagonal principal y
		 * avanza
		 */

		for (int i = 1; i < matrix[0].length; i++) {
			cont = 1;
			consecutivoActual = matrix[0][i];
			for (int j = 1, k = i + 1; j < matrix.length && k < matrix[j].length; j++, k++) {
				if (matrix[j][k] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[j][k];
				}
				if (cont == 4) {
					return true;
				}
			}
		}

		// diagonal secundaria
		/**
		 * Va de la diagonal secundaria hacia arriba
		 * 
		 * 00 01 02 03 04 05 
		 * 10 11 12 13 14 15 
		 * 20 21 22 23 24 25 
		 * 30 31 32 33 34 35 
		 * 40 41 42 43 44 45
		 * 50 51 52 53 54 55
		 */
		
		for (int i = 0; i < matrix.length; i++) {
			cont = 1;
			consecutivoActual = matrix[i][matrix[i].length - 1];
			for (int j = i + 1, k = matrix[i].length - 2; j < matrix.length && k >= 0; j++, k--) {
				if (matrix[j][k] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[j][k];  // si no es igual actualizamos para el siguiente
				}
				if (cont == 4) {
					return true;
				}
			}
		}

		/**
		 * Va de la diagonal secundaria hacia abajo
		 */

		for (int i = matrix[0].length - 2; i >= 0; i--) {
			cont = 1;
			consecutivoActual = matrix[0][i];
			for (int j = 1, k = i - 1; j < matrix.length && k >= 0; j++, k--) {
				if (matrix[j][k] == consecutivoActual) {
					cont++;
				} else {
					cont = 1;
					consecutivoActual = matrix[j][k];
				}
				if (cont == 4) {
					return true;
				}
			}

		}

		return false;
	}

	public static void imprimeMatriz(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
