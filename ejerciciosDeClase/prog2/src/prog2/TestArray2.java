package prog2;

public class TestArray2 {
	
	public static void main(String[] args) {
		
		int [][] k = new int[3][4];
		for(int i = 0; i < k.length; i++) {
			for(int j = 0; j < k[0].length; j++)
				k[i][j] = (j+1-i);
		}
	
	
		for(int i = 0; i < k.length; i++) {
			for(int j = 0; j < k[i].length; j++)
				System.out.print(k[i][j]+" ");
		System.out.println();
		}
	}

}
