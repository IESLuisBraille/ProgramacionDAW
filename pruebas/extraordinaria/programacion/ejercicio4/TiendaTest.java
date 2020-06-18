package extraordinaria.programacion.ejercicio4;

public class TiendaTest {
	
	public static void main(String[] args) {
		
	    // Creamos cliente
		
		Cliente c = new Cliente("smith", "jhon", "1 The Avenue");
		
		// Realizamos pedido
		Fruta f1 = new Fruta(3, 2, "Manzanas");
		Vegetal v1 = new Vegetal(1.2, 3 , "Zanahorias");
		
		c.addItemAlPedido(f1);
		c.addItemAlPedido(v1);
		c.mostrarDetallesDelPedido();
		c.resumenPedido();
		c.borrarItemDelPedido(1);
		c.mostrarDetallesDelPedido();
		c.resumenPedido();
		c.realizar();
		TartaFitness t1= new TartaFitness("Tarta de Chocolate", 10, "Feliz Cumpleaños");
		c.addItemAlPedido(t1);
		c.mostrarDetallesDelPedido();
		c.resumenPedido();
		c.realizar();
		TartaFitness t2 = new TartaFitness("Tarta de Tiramisú", 100, "Recién casados");
		c.addItemAlPedido(t2);
		c.mostrarDetallesDelPedido();
		c.resumenPedido();
		c.realizar();
		
	}

}
