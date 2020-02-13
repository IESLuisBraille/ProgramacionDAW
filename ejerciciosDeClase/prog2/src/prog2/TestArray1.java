package prog2;

public class TestArray1 {

	public static void main(String[] args) {
		int j=0; int[] i=new int[1];
		 i[0]=0;
		modificaArray(j,i);
		System.out.println(j+"-"+i[0]);
		 /* Mostrará por pantalla "0–1", puesto que el
		contenido del array es
		modificado en la función, y aunque la variable j también se modifica, se
		modifica una copia de la misma,
		dejando el original intacto */
		}
		static  void modificaArray(int j, int[] i) {
		j++; i[0]++;
		 /* Modificación de los valores de la variable, solo afectará al
		array, no a j */
		}


}
