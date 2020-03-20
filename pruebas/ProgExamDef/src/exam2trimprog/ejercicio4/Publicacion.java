package exam2trimprog.ejercicio4;

public abstract class Publicacion {
  /**
 * @uml.property  name="isbn"
 */
protected String isbn;
  /**
 * @uml.property  name="titulo"
 */
protected String titulo;
  /**
 * @uml.property  name="anio"
 */
protected int anio;

  public Publicacion(String isbn, String titulo, int anio) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.anio = anio;
  }
public abstract String toString();
 
}
