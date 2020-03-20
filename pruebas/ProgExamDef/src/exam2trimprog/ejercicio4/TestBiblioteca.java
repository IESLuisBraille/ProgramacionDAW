package exam2trimprog.ejercicio4;

public class TestBiblioteca {

  public static void main(String[] args) {

	  
	  Libro[] libros = new Libro[3];
	  libros[0] = new Libro("123456", "Programación en Java", 2018);
	  libros[1] = new Libro("112233", "Metodología de la Programación", 2016);
	  libros[2] = new Libro("456789", "Sistemas Operativos", 2015);
	  
	  Revista[] revistas = new Revista[2];
	  revistas[0] = new Revista("444555", "Linux Magazine", 2019, 344);
	  revistas[1] = new Revista("002244", "Cómo Programar", 2020, 255);
	  
	   
	    for (int i = 0; i < libros.length; i++)
	    	System.out.println(libros[i]);
	    for (int i = 0; i < revistas.length; i++)
	    	System.out.println(revistas[i]);
	    
	    libros[2].presta();
	    if (libros[2].estaPrestado()) {
	      System.out.println("El libro está prestado");
	    }
	    libros[1].presta();
	    libros[1].devuelve();
	    if (libros[1].estaPrestado()) {
	      System.out.println("El libro está prestado");
	    }
	    libros[2].presta();

	  }

}
