package prog;


import java.util.*;
/**
 *
 * @author Usuario
 */
public class DevolucionImpuestosTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 
       DevolucionImpuestos tasa;
        Scanner sc = new Scanner(System.in);
        int correct1 = 0, correct2 = 0, correct3 = 0, correct4 = 0;
        char c;
        String estadoCivil = "", numSS = "", cp = "", nombre;
        int ingresosAnuales = 0, i;
        System.out.println("Introduzca el nombre:");
        nombre = sc.nextLine();
        while(correct1 != 1 || correct2 != 5 || correct3 != 1 || correct4 != 1){
            correct1 = 0; // para ver si cumple el numSS
            correct2 = 0; // para ver si cumple el cp, verificamos si tiene 5 dígitos
            correct3 = 0; //
            correct4 = 0;
            System.out.println("Introduce el número de la seguridad social diez cifras (1234567890):");
            numSS = sc.nextLine();
            if(numSS.matches("[0-9]{10}")){
                correct1 = 1;
            }
            System.out.println("Introduce el códio postal (5 cifras):");
            cp = sc.nextLine();
            if(cp.length() == 5){
                for(i = 0;i < 5;++i){
                    c = cp.charAt(i);
                    if(Character.isDigit(c))
                        correct2 += 1;
                }
            }
            System.out.println("Introduce tu estado civil (Casado o Soltero):");
            estadoCivil = sc.nextLine();
            c = Character.toUpperCase(estadoCivil.charAt(0));
            if(c == 'C' || c == 'S')
                correct3 += 1; // si es Soltero o Casado también es correcto
            System.out.println("Cuáles son tus ingresos anuales?: ");
            ingresosAnuales = sc.nextInt();
            if(ingresosAnuales >= 0)
                correct4 += 1;  // si espositivo es correcto
            sc.nextLine();
        }
        tasa = new DevolucionImpuestos(numSS, nombre, Integer.parseInt(cp), ingresosAnuales, estadoCivil);
        tasa.mostrarDatos();
    }
    
}