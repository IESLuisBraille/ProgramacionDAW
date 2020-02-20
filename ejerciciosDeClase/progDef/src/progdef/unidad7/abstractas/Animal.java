package progdef.unidad7.abstractas;

abstract class Animal {
	private double weight;

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/** Return animal sound */
	public abstract String sound();
}