package recuperaciones2t.prog;

import java.util.Scanner;

public class VerificadorPassword {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Introduce password: ");
		String password = input.nextLine();

		if (esValidoPassword(password)) {
			System.out.println("Password correcto");
		}
		
		else System.out.println("Password incorrecto");
	}

	public static boolean esValidoPassword(String password) {
		int contLetras = 0;
		int contDig = 0;
		boolean esMayus = false;
		boolean esValida = true;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			
			if (Character.isUpperCase(c) && !esMayus) {
				esMayus = true;
			}
			
			if (!Character.isLetterOrDigit(c)) {
				esValida = false;
				break;
			}
			if (Character.isLetter(c)) {
				contLetras++;
			} else {
				contDig++;
			}
			
		}
		
		if (password.length() < 10 || contDig <= 2 || !esMayus) {
			esValida = false;
		}
		return esValida;
	}
}