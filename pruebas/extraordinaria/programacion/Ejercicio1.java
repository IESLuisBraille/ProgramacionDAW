/**
 * Ejercicio 1
 */
package extraordinaria.programacion;

import java.util.Scanner;

public class Ejercicio1 {
	
	// 431345632242325
	// suma de los dos dígitos, aunque puede hacerlo de más pero sirve para nuestro caso.
	static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Recibe código de transacción: ");
		
		//Constantes tipo operación
		final String ENVIO = "envio";
		final String SOLICITUD = "solicitud";
		final String TARJETA = "tarjeta";
		final String TRANSFER = "transfer";
		
		String tipo_op = ""; // el tipo que de operación que se va a realizar
		
		String cod = sc.nextLine();
		
		//Convertimos a array de enteros
		
		int [] codint = new int[cod.length()];
			
		for (int i = 0; i < cod.length(); i++) {
			codint[i] = Integer.parseInt(String.valueOf(cod.charAt(i))); 
					
		}
		
		if (codint.length > 18 || codint.length < 15)
			throw new IllegalArgumentException("El código debe estar entre 15 y 18 cifras");
		
//		for (int i = 0; i < cod.length(); i++) {
//			if (codint.)
//					throw new IllegalArgumentException("No es un código válido, sólo digitos");	
//		}
		
		// Comprobamos el código de la transacción de los códigos válidos
		if (codint[0] == 2)
			tipo_op = ENVIO;
		else if (codint[0] == 3)
			tipo_op = SOLICITUD;
		else if ( codint[0] == 4 && codint[1] == 3)
			tipo_op = TARJETA;
		else if ( codint[0] == 7 && codint[1] == 6)
			tipo_op = TARJETA;
		else
			throw new IllegalArgumentException("Código de operación incorrecto ");
		
		int sumpar = 0, sumparcialpar;
		int sumimpar = 0;
		
		for (int i = 0; i < codint.length; i++) {
			if (i % 2 == 0) {
				sumparcialpar = codint[i] * 2;
				if (String.valueOf(sumparcialpar).length() == 2) {
					sumparcialpar = getSum(sumparcialpar);
					
				}
			    sumpar += sumparcialpar;	
			}

			
			else { 
				sumimpar += codint[i];
			}			
		}
		
		if ( sumimpar % 10 == 0 && sumpar % 10 == 0)
			System.out.println("Código válido");
		else
			throw new IllegalArgumentException("Código inválido");
		
	}

}
