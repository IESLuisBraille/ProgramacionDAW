package extraordinaria.programacion;

import java.util.Scanner;

public class VentanaDeslizante {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce ventana: ");
		String ventana = sc.nextLine();
		System.out.println("Introduce chars: ");
		String cad = sc.nextLine();
		System.out.println(minVentana(ventana, cad));
		
	}
	
	public static String minVentana(String entrada, String caracteres) {
		
		int longEntrada = entrada.length();
		int longCaracteres = caracteres.length();
		
		// inicializamos el encontrarArray
		int[] encontrar = new int[256];
		for (int i = 0; i < longCaracteres; i++) {
			encontrar[caracteres.charAt(i)]++;
		}
		
		int[] encontrado =new int[256];
		int longVentanaMin = Integer.MAX_VALUE;
		int inicioVentanaMin = 0;
		int finalVentanaMin = 0;
		int cont =0;
		
		for(int begin = 0, end = 0; end < longEntrada; end++) {
			//saltarse caracteres
			if(encontrar[entrada.charAt(end)] == 0)
				continue;
			encontrado[entrada.charAt(end)]++;
			if(encontrado[entrada.charAt(end)] <= encontrar[entrada.charAt(end)])
				cont++;
			
			if (cont == longCaracteres) {
				while(encontrar[entrada.charAt(begin)] == 0 || encontrado[entrada.charAt(begin)] > encontrar[entrada.charAt(begin)]) {
					if (encontrado[entrada.charAt(begin)] > encontrar[entrada.charAt(begin)])
						encontrado[entrada.charAt(begin)]--;
					begin++;
				}
				
				int windowLen = end - begin + 1;
				if (windowLen < longVentanaMin) {
					inicioVentanaMin = begin;
					finalVentanaMin = end;
					longVentanaMin = windowLen;
				}
			}
			
		}
		return (cont == longCaracteres) ? entrada.substring(inicioVentanaMin, finalVentanaMin + 1) : "";
	}
		
	}


