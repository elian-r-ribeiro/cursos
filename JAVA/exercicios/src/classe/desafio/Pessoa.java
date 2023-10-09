package classe.desafio;

public class Pessoa {
	String personName;
	double personWeight;
	Comida food;

	Pessoa(String personName, double personWeight) {
		this.personName = personName;
		this.personWeight = personWeight;
	}

	void eatFood(Comida food) {
		if (food != null) {
			this.personWeight += food.foodWeight;
		}
	}
	
	String presentWeight() {
		return String.format("Peso do %s: %.2fKGs", this.personName, this.personWeight);
	}
}
