/**
 * Coche.java
 * Definición de la clase Coche
 * @author Iván J.U.
 */
public class Coche {

  // atributo de clase
  int kilometrajeTotal = 0;
  
  // método de clase
  public int getKilometrajeTotal() {
    return this.kilometrajeTotal;
  }
  
  private String marca;
  private String modelo;

  public Coche(String ma, String mo, int kmT) {
    this.marca = ma;
    this.modelo = mo;
    this.kilometraje-total = kmT;
  }
  
  public int getKilometraje() {
    return this.kilometrajeTotal;
  }

  /**
   * Recorre una determinada distancia.
   * 
   * @param km distancia a recorrer en kilómetros
   */  
  public void recorre(int km) {
    this.kilometrajeTotal += km;
    Coche.kilometrajeTotal += km;
  }
}
