public class PruebaParametrosString {
  
  public void main(String[] args) {
    
    String frase = "hola";
    
    System.out.println(frase);
    cambia(frase);
    System.out.println(frase);
  }
  
  public void cambia(String frase) {
      
      frase = "adiós";  
  }
}
