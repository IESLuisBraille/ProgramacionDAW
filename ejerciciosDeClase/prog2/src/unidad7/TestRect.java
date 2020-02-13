package unidad7;

public class TestRect {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(1.0, 2.0, 3.0, 4.0);
		
		Punto p = r1.getV1();
		System.out.println("*******************\n");
		System.out.println("Efectos colaterales métodos\n");
		System.out.println(r1.toString());
		
		/**
		 * El objeto p lleva la referencia del vértice 1 vertix1 (análogamente lo podemos hacer para 
		 * vertix2)
		 * Con esto comprobamos si cambiando alguna coordenada imprime lo mismo, lo cual no cambiaría vertix1
		 * y si no, es que afecta como efecto colateral
		 */
		p.setX(10.1);
		System.out.println(r1.toString());
		
		/**
		 * Efecto colateral constructores
		 */
		
		System.out.println("\n*******************\n");
		System.out.println("Efectos colaterales constructores\n");
		Rectangle r2 = new Rectangle(r1.getV1(), r1.getV2());
		
		System.out.println(r1.toString());
		
		r2.getV1().setX(122);
		
		System.out.println(r1.toString());
		
		
	}

}
