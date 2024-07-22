package oo.polimorfismo;

public abstract class Comida {

	private double weight;
	
	public Comida(double weight) {
		setPeso(weight);
	}

	public double getPeso() {
		return weight;
	}

	public void setPeso(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
}
