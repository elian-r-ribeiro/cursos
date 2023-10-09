package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", 99.8);
		Comida f1 = new Comida("Arroz", 0.180);
		Comida f2 = new Comida("Feijão", 0.300);
		
		p1.eatFood(f1);
		System.out.println(p1.presentWeight());
		p1.eatFood(f2);
		System.out.println(p1.presentWeight());
	}
}
