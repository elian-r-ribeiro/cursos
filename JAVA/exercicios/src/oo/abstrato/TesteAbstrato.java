package oo.abstrato;

public class TesteAbstrato {
	public static void main(String[] args) {
		
		Mamifero a1 = new Cachorro();
		System.out.println(a1.walk());
		System.out.println(a1.breastfeed());
		System.out.println(a1.breathe());
	}
}
