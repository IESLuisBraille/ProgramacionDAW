package Ejercicio3;
/**
 * Ejercicio plan de pago de préstamo. 
 * Se necesita realizar una simulación de un pago de un pŕestamo poniendo los pagos de cada mes hasta
 * acabar de realizar los pagos.
 * 
 * Introducidos por el usuario la cantidad total del pŕestamos, los años a pagar y el interés anual, 
 * se debe construir la hoja formateada
 * Mostrando primeramente el pago mensual y el total del pago
 * Después se muestra las columnas: pago, interés mensual, 
 */
import java.util.Scanner;

public class PlanPrestamo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double loanAmount = 0;
		int numberOfYears = 0;
		double annualInterestRate = 0;
		
		System.out.print("Total Préstamo: ");
				loanAmount = scanner.nextDouble();
	
		System.out.print("Número de años: ");

		numberOfYears = scanner.nextInt();
//		

		System.out.print("Tasa de interés anual ");
			annualInterestRate = scanner.nextDouble();
	

		
		double interest, principal, balance = loanAmount;
		double monthlyInterestRate = annualInterestRate / 12 / 100.;
		double monthlyPayment = loanAmount * monthlyInterestRate / 
				(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.printf("\nMonthly payment: %.2f\n", monthlyPayment);
		System.out.printf("Total payment: %.2f\n\n", totalPayment);
		System.out.println();
		System.out.println("NumPago\t\tInterés\t\tBase\t\tRestante\n");
				
		for(int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n",
					i, interest, principal, balance);
		}	
	}
}