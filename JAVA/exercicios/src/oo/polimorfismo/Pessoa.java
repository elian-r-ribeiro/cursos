package oo.polimorfismo;

public class Pessoa {

	private double weight;

	public Pessoa(double weight) {
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
	
	public void eat(Comida food) {
		this.weight += food.getPeso();
	}
}
