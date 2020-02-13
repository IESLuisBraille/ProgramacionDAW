package unidad7;

public class Punto {

		private double x;
		private double y;
		
		double getX() {
			return this.x;
		}

		double getY() {
			return this.y;
		}
		
		void setX(double x ) {
			this.x = x;
		}
		
		void setY(double y) {
			this.y = y;
		}
		
		public Punto(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public Punto() {}
}
