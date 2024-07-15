package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador p1 = new Heroi();
		p1.x = 10;
		p1.y = 10;
		
		Jogador p2 = new Monstro();
		p2.x = 10;
		p2.y = 11;
		
		
		
		System.out.println(p1.hp);
		System.out.println(p2.hp);
		
		p1.attack(p2);
		
		System.out.println(p1.hp);
		System.out.println(p2.hp);
		
		p2.attack(p1);
		
		System.out.println(p1.hp);
		System.out.println(p2.hp);
	}
}
