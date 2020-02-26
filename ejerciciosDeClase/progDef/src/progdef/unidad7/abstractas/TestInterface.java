package progdef.unidad7.abstractas;

public class TestInterface // implements Edible, NotEdible
{

//	@Override
//	public void miFunc1() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void miFunc3() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public void miFunc2() {
//		// TODO Auto-generated method stub
//		
//	}
	
	private static Edible e;

	public static void main(String[] args) {
		
		Chicken chi1 = new Chicken();
		Tiger tig1 = new Tiger();
		
		System.out.println(chi1.howToEat());
		System.out.println(tig1.sound());
		System.out.println(chi1.sound());
		Apple ap1 = new Apple();
		System.out.println(ap1.howToEat());
		System.out.println(ap1.sound());
		
		
		
		
	}
}
