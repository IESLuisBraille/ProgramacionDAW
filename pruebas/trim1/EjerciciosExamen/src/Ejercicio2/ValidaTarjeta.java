package Ejercicio2;

/**
 * @author Iván J. U.
 * Programa que valida una tarjeta bancaria y dice si está validada y si pertenece a Visa, Master Card o Amercian Express.
 * Como entrada se recibe un número de tarjeta entre 13 y 16 dígitos.
 * Comprueba que es válida si la suma de todos sus dígitos tiene como resultante un número que es primo.
 * Además, debe de comprobar que la primera cifra sea un 4 (Master Card), 3 (Visa), ó 2 (American Express)
 * para saber de qué tipo de tarjeta se trata.
 */


import java.util.Scanner;

public class ValidaTarjeta {
	
	//Método de comprobación de número primo 
	public static boolean esPrimo(int num) {
		boolean p = true; 
		for(int i=2;i<num;i++) {
			if (num % 2 == 0)
				p = false;
		}
		return p;
			
	}
	
	//Comprobación de número de dígitos de un número
	public static long numDigitos(long num) {
		long ndig = 0;
		while (num > 0) {
			ndig++;
			num /= 10;
		}
		return ndig;
	}
	
	//Variables
    static String digito = "";
	static int digvalidador = 0;
	static int ultimodigito;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.out.println("Introduce número de tarjeta a validar: ");
			
		Scanner sc = new Scanner(System.in);
		long cuenta = sc.nextLong();
		long auxcuenta = cuenta;
		
		//Validamos el número de dígitos
		if (ValidaTarjeta.numDigitos(cuenta) > 16 || ValidaTarjeta.numDigitos(cuenta) < 13) {
			String msg = "Error en cuenta, número de dígitos incorrecto: Debe estar entre 13 y 16";
			System.out.println(msg);
			System.exit(1);
		}
		
		while (cuenta > 0) {
			//Descomponemos el número de 
			int ndig = (int) ValidaTarjeta.numDigitos(cuenta);
			int numcuenta = (int) (cuenta % 10);
			digvalidador += cuenta % 10;				
			cuenta /= 10;
			ndig--;
			if (ndig == 1) ultimodigito = (int) cuenta % 10;
		}
		
//		System.out.println(ultimodigito);
//		System.out.println(digvalidador);
		
		if (esPrimo(digvalidador)) {
			System.out.printf("Tarjeta %d validada%n", auxcuenta);

			switch (ultimodigito) {
				    case 4 : System.out.println("Tipo tarjeta: Master Card"); break;
				    case 3 : System.out.println("Tipo tarjeta: Visa"); break;
				    case 2 : System.out.println("Tipo tarjeta Amercian Expresa"); break;
				    default: System.out.println("Error en tipo de tarjeta");
			}
		}
		else {
			  
			System.out.println("Tarjeta no validada");
			System.exit(1);
		}

  }
} 
