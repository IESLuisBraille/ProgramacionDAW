package prog2;

public class TestArray3 {
	
	
	public static void main(String[] args) {
		
		int [][] v1 = { 
				{1,2,3,4,5},
				{2,3,4,5},
				{3,4,5},
				{4,5},
				{5}
		};
		
		for (int i = 0; i < v1.length; i++) {
			for( int j=0; j < v1[i].length; j++)
				System.out.print(v1[i][j]+" ");
			System.out.println();
		}
		
		int [][] v2 =  new int[4][];
		v2[0] = new int[4];
		v2[1] = new int[5];
		v2[2] = new int[3];
		v2[3] = new int[5];
		
		for (int i = 0; i < v2.length; i++) 
			for( int j=0; j < v2[i].length; j++)
				v2[i][j] = (int) ( Math.random() * 10 );
		
		for (int i = 0; i < v2.length; i++) {
			for( int j=0; j < v2[i].length; j++)
				System.out.print(v2[i][j]+" ");
			System.out.println();
		}
			
	}

}
