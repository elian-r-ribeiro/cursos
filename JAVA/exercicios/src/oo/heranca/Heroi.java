package oo.heranca;

public class Heroi extends Jogador{
	
	boolean attack(Jogador opponent) {
		boolean attack1 = super.attack(opponent);
		boolean attack2 = super.attack(opponent);
		
		return attack1 || attack2;
	}
}
