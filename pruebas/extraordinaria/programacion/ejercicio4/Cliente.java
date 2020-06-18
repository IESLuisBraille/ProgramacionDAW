package extraordinaria.programacion.ejercicio4;



public class Cliente implements Operaciones{
	
	private String apellido;
	private String nombre;
	private String direccion;
	private int cont = 0;;
	private final double ENVIO  = 7.0;
	
	Item[] pedido = new Item[10];
	
	public Cliente(String apellido, String nombre, String direccion) {
		this.apellido = apellido;
		this.direccion = direccion;
		this.nombre = nombre;
	}
	
	
	void addItemAlPedido(Item i) {
	     pedido[cont] = i;
	     cont++;
	     
	     System.out.println("**********************************Añadido producto*********");
	     System.out.println(pedido[cont -1].describirItem());
		
	}
	void borrarItemDelPedido(int i) {
		
		Item[] temp = new Item[10];  //Lo creamos de 10 para que no se salga de límite
		for (int j= 0; j <  cont; j++) {
			if (i == j) continue;
			temp[j] = pedido[j];
		}
		
		cont--;
		pedido = temp;
		    
	     System.out.println("**********************************Eliminado producto*********");

	}
	void mostrarDetallesDelPedido() {
		
		System.out.println(">>>>>>>>>>>>>> Detalle del pedido <<<<<<<<<<<<<<<<<<<<");
		
		for ( int i = 0; i < cont; i++) {
			System.out.printf("Nº producto: %d Tipo: %s Descripción %s Coste %.2f\n" , 
					i , pedido[i].getTipo() , pedido[i].describirItem() ,pedido[i].calcularCoste());
			
		}
		
	}
	
	void resumenPedido() {
		System.out.println(">>>>>>>>>>>>>> Resumen y total coste del pedido <<<<<<<<<<<<<<<<<<<<");

		double costepedido = totalCostePedido();
		
		for ( int i = 0; i < cont; i++) {
			 System.out.printf("Resumen: %s %.2f\n", pedido[i].describirItem(), pedido[i].calcularCoste());
		}
		
		System.out.printf("Total coste pedido: %.2f\n", costepedido);
	}
	
	double totalCostePedido() {
		
		double total = 0.0;
		for (int i = 0; i < cont; i++)
			total += pedido[i].calcularCoste();
			
			
		return total;
	}


	@Override
	public void realizar() {
		// TODO Auto-generated method stub
		if (totalCostePedido() < 10.0)
			System.out.println("El número total de pedido es menor de 10€, debes cargar la cesta con más productos");
		else if (totalCostePedido() <= 30 && totalCostePedido() >= 10) 
			System.out.println("El coste del pedio será: " + totalCostePedido() + " € más gastos de envío "+ ENVIO + "Total: " +  (totalCostePedido() + ENVIO));
		else if (totalCostePedido() > 30)
			System.out.println("El coste del envío es gratuito, coste total del pedido: " + totalCostePedido());
	}



}
