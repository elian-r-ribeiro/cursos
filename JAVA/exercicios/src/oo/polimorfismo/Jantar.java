package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa guest = new Pessoa(99.65);
		Comida rice = new Arroz(0.200);
		Comida bean = new Feijao(0.100);
		Comida iceCream = new Sorvete(0.4);
		
		System.out.println(guest.getPeso());
		
		guest.eat(rice);
		guest.eat(bean);
		
		System.out.println(guest.getPeso());
		
		guest.eat(iceCream);
		
		System.out.println(guest.getPeso());
	}
}
