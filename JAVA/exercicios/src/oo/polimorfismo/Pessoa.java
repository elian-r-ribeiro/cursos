package oo.polimorfismo;

public class Pessoa {

	private double weight;

	public Pessoa(double weight) {
		setWeight(weight);
	}
	
	public void eat(Comida food) {
		this.weight += food.getWeight();
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
