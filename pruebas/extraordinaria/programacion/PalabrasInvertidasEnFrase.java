package extraordinaria.programacion;

/**
 * Ejercicio 2
 * @author ivanju
 */

import java.util.Scanner;

public class PalabrasInvertidasEnFrase {
	
	public String palabraInversa(String s) {
		if ( s == null || s.length() == 0 )
			return "";
		int actual = 0, comienzo = 0;
		s = inverso(s);
		StringBuilder sb = new StringBuilder();
		while ( actual < s.length()) {
			if (s.charAt(actual) != ' ') {
				actual++;
			}else {
				if (comienzo != actual ) {
					sb.append(inverso(s.substring(comienzo, actual)) + " ");
					comienzo = actual;
				}
				
				else {
					actual++;
					comienzo++;
				}
			}
				
		}
		if (comienzo != actual) {
			sb.append(inverso(s.substring(comienzo, actual)) + " ");
			
		}
		return sb.length() != 0 ? sb.toString().substring(0, sb.length() -1) : "";
	}
	
	public String inverso(String s) {
		if (s == null || s.length() == 0)
			return "";
		int length = s.length(), last = length - 1;
		char[] chars = s.toCharArray();
		
		for (int i = 0; i < length / 2; i++) {
			char c = chars[i];
			chars[i] = chars[last -i];
			chars[last - i] = c;
		}
		
		return new String(chars);
	}
	
	public static void main(String[] args) {
		PalabrasInvertidasEnFrase palabra = new PalabrasInvertidasEnFrase();
		System.out.println("Escribe la frase: ");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println("Frase invertida: " + palabra.palabraInversa(frase));
	}

}
