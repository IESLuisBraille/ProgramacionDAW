package Ejercicio3;

/*
 * Ejercicio 3      
 *
 * =====================================================================================
 */
public class CuentaDeAhorraTest{
    public static void main(String[] args){
        CuentaDeAhorro saver1 = new CuentaDeAhorro(2000.00);
        CuentaDeAhorro saver2 = new CuentaDeAhorro(3000.00);

        CuentaDeAhorro.modificarTasaInteres(0.04f);

        System.out.printf("Ahorrador1 saldo inicial: %.2f\n", saver1.getTotalSaldo());
      //  System.out.printf("Ahorrador2 salido inicial: %.2f\n", saver2.getTotalSaldo());
        System.out.println();

        for(int i=0; i<12; i++){
            saver1.calcularInteresMensual();
         //   saver2.calcularInteresMensual();
        }

        System.out.printf("Ahorrador1 - 12 meses al %.2f%% interest: %.2f\n", CuentaDeAhorro.getTasaDeInteresAnual(), saver1.getTotalSaldo());
       // System.out.printf("Ahorrador2 - 12 months at %.2f%% interest: %.2f\n", CuentaDeAhorro.getTasaDeInteresAnual(), saver2.getTotalSaldo());

        System.out.println("\nAumento de la tase de interés al 5%\n");

        CuentaDeAhorro.modificarTasaInteres(0.05f);

        saver1.calcularInteresMensual();
        saver2.calcularInteresMensual();

        System.out.printf("Ahorrador1 - 12 meses al %.2f%% interest: %.2f\n", CuentaDeAhorro.getTasaDeInteresAnual(), saver1.getTotalSaldo());
     //   System.out.printf("Ahorrador2 - 12 months at %.2f%% interest: %.2f\n", CuentaDeAhorro.getTasaDeInteresAnual(), saver2.getTotalSaldo());


    }
}