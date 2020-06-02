package prog;
import java.util.Scanner;

public class BalanceBancarioTasaAnual {
	
	public static void main(String[] args) {
		
		double balanceInicial;
		double balance;
		int anyo;
		double interes;
		final double BAJO = 0.02;
		final double ALTO = 0.05;
		final double INCREMENTO = 0.01;
		final int MAX_ANYOS = 4;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el balance bancario: ");
		balanceInicial = sc.nextDouble();
		
		for(interes = BAJO; interes <= ALTO; interes += INCREMENTO) {
			balance = balanceInicial;
			System.out.println("Con un balance inicial de € " + balance + " y un interés "+ interes);
			
			for(anyo = 1; anyo <= MAX_ANYOS; anyo++){
				balance = balance + balance * interes;
				System.out.println("Después del año: " + anyo + " el balance es € "+ balance);
			}
		}
		
	}

}
