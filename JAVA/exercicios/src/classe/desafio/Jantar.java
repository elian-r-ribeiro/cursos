package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jãozin", 89);
		Comida f1 = new Comida("Feijãozin", 0.3);
		Comida f2 = new Comida("Arrozin", 0.2);
		p1.eat(f1);
		p1.eat(f2);
	}
}
