package examen2trimprog;
/*
 * Ejercicio 1 
*/
import java.util.Scanner;

public class Ejercicio1 {
	/** Main Method */
	public static void main(String[] args) {
		int[] counts = new int[100]; // Cuenta las ocurrencias de los números

		System.out.print("Introduce enteros del 1 al 100: ");

		//Llamada a función de ocurrencias. Se puede hacer sin función.
		Scanner input = new Scanner(System.in);
		int num; // holds user input
		do {
			num = input.nextInt();
			if (num >= 1 && num <= 100)	
				counts[num - 1]++;
		} while (num != 0);
		

		// Muestra los resultados
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] > 0) 
				System.out.println((i + 1) + " sale " + counts[i] +
					 (counts[i] > 1 ? " veces" : " vez"));
		}
	}

	
}
