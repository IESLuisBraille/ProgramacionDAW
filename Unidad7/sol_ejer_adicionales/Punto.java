/**
 * Write a description of class Punto here.
 *
 * @author ()
 * @version ()
 */
public class Punto{
		public double x;
		public double y;
		public Punto( double ParametroCoord_x , double ParametroCoord_y){
			this.x = ParametroCoord_x;
			this.y = ParametroCoord_y;
		};
    public Punto( Punto P ){ //Constructor de copia.
      //El punto creado usando este constructor, tendrá las coordenadas
      //del Punto que se le pase como parámetro.
      this.x = P.x;
      this.y = P.y;
    }
    public Punto(){ //Constructor por defecto.
      x = 0.;
      y = 0.;
    }
    
		public double distancia( Punto Q ){ //metodo distancia
			//Calculo de la Distancia de P a Q. Por Pitagoras.
			// d = sqrt( (x-x0)2 + (y-y0)2 ); //Metodo reaiz cuadrada es sqrt().
      double distanciaCalculada = Math.sqrt( Math.pow((x-Q.x) ,2) + Math.pow((y-Q.y) ,2) );
			return distanciaCalculada;
      //Con return se devuelve el valor de la distanciaCalculada.
		}
}
