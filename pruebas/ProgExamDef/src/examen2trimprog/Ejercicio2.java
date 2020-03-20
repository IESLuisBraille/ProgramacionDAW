package examen2trimprog;

public class Ejercicio2 {
	// Initialize 7-by-7 matrix with data
	static int[][] weeklyHours = { 
							{ 2, 4, 3, 4, 5, 8, 8 }, 
							{ 7, 3, 4, 3, 3, 4, 4 }, 
							{ 3, 3, 4, 3, 3, 2, 2 },
							{ 9, 3, 4, 7, 3, 4, 1 }, 
							{ 3, 5, 4, 3, 6, 3, 8 }, 
							{ 3, 4, 4, 6, 3, 4, 4 }, 
							{ 3, 7, 4, 8, 3, 8, 4 },
							{ 6, 3, 5, 9, 2, 7, 9 }, };

	// Initialize 7-by-2 matrix with total hours of each employee
	static int[][] totalHours; 

	public static void main(String[] args) {

        totalHours = sumRows(weeklyHours);
		// Sort matrix in decreasing order of the total hours
		//sort(totalHours);

		// Display results
		print(totalHours);
	}

	/** sumRows returns a matrix with the total of each row */
	public static int[][] sumRows(int[][] m) {
		// Create a 7-by-2 matrix
		int[][] totals = new int[m.length][2];

		for (int row = 0; row < m.length; row++) {
			totals[row][0] = row;
			totals[row][1] = 0;
			for (int col = 0; col < m[row].length; col++) {
				totals[row][1] += m[row][col];
			}
		}
		return totals;
	}

	

	/** print displays table of employees and their total hours */
	public static void print(int[][] m) {
		System.out.println("Empleado     Horas semanales");
		System.out.println("----------------------------");
		for (int row = 0; row < m.length; row++) {
			System.out.printf("%4d%16d\n", m[row][0], totalHours[row][1]);
		}
	}

}
