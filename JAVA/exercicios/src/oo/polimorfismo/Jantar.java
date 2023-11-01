package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa guest = new Pessoa(99.65);
		
		System.out.println(guest.getWeight());
		
		Comida food1 = new Arroz(0.2);
		
		guest.eat(food1);
		System.out.println(guest.getWeight());
		
		Comida food2 = new Feijao(0.1);
		
		guest.eat(food2);
		System.out.println(guest.getWeight());
		
		Comida food3 = new Sorvete(0.4);
		
		guest.eat(food3);
		System.out.println(guest.getWeight());
	}
}
