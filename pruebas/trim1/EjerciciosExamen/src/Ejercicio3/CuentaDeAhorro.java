package Ejercicio3;

/*
 *    Ejercicio 3
 *
 * =====================================================================================
 */
public class CuentaDeAhorro{
    private static double tasaInteresAnual = 0.0d;
    private double totalSaldo = 0.0d;

    // constructor
    public CuentaDeAhorro(double totalSaldo){
        setTotalSaldo(totalSaldo);
    }
    // SETTERS
    public void setTotalSaldo(double totalSaldo){
        this.totalSaldo = totalSaldo;
    }
    // update the interest rate
    public static void modificarTasaInteres(double nuevaTasaInteres){
        // check for negative interest rates
        if(nuevaTasaInteres >= 0.0d)
            tasaInteresAnual = nuevaTasaInteres;
        else {
            System.out.println("El interés debe ser >= 0.0d");
            System.exit(1);
        }
    }
    // GETTERS
    public double getTotalSaldo(){
        return this.totalSaldo;
    }
    public static double getTasaDeInteresAnual(){
        return tasaInteresAnual;
    }
    // calculates the monthly interest and update the savings balance
    public void calcularInteresMensual(){
        totalSaldo += (totalSaldo * tasaInteresAnual) / 12.;
        System.out.println(totalSaldo);
    }
   
}
