package progdef.unidad7.herencia;

public class TestObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Object o = new Object();
//		System.out.println(o.getClass());
//		
		TestObj obj = new TestObj();
		TestObj obj2 = new TestObj();
		System.out.println(obj.getClass() + " "
									+ obj.hashCode() + " "
									+ obj2.hashCode());
		

	}

}
