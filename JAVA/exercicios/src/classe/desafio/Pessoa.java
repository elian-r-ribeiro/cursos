package classe.desafio;

public class Pessoa {
	String name;
	double weigth;
	
	Pessoa(String name, double weigth) {
		this.name = name;
		this.weigth = weigth;
	}
	
	void eat(Comida food) {
		System.out.printf("O peso de %s era %.2f antes de comer %s\n", 
				this.name, this.weigth, food.name);
		
		this.weigth += food.weigth;
		
		System.out.printf("Após comer %s o peso de %s é %.2f\n",
				food.name, this.name, this.weigth);
	}
}
