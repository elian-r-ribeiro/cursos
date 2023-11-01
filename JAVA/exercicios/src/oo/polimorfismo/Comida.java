package oo.polimorfismo;

public abstract class Comida {

	private double weight;

	public Comida(double weight) {
		setWeight(weight);
	}
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
}
