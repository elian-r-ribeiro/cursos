package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {
		
		Mamifero dog = new Cachorro();
		
		System.out.println(dog.walk());
		System.out.println(dog.breastfeed());
		System.out.println(dog.breath());
	}
}
