
public class PruebaIndividuo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Individuo i1=new Individuo("02345219R", "José Nogales", 1978);
//		Individuo i2=new Individuo("32344401R", "Ana López", 1973);
//		Individuo i3=new Individuo("01345420R", "Mario Carrascosa", 1988);
//		Individuo i4=new Individuo("07257219R", "Jose Luis Ramírez", 1999);
		
		System.out.println(Individuo.getPoblacion());
		Individuo.setPoblacion(10);
		System.out.println(Individuo.getPoblacion());

		Individuo i1=new Individuo("02345219R", "José Nogales", 1978);
		System.out.println(i1.getPoblacion());


	}
}
