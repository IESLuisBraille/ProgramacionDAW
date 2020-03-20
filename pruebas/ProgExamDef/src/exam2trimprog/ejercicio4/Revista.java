package exam2trimprog.ejercicio4;

public class Revista extends Publicacion {
  /**
 * @uml.property  name="numero"
 */
private int numero;

  public Revista(String isbn, String titulo, int anio, int numero) {
    super(isbn, titulo, anio);
    this.numero = numero;
  }

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Revista con isbn " + this.isbn + "título: " + this.titulo + "año " + "número: " + this.numero;
}
}
