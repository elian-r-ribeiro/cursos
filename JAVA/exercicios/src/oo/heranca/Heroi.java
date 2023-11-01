package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y) {
		super(x, y);
	}

	public boolean attack(Jogador opponent) {
		boolean attack1 = super.attack(opponent);
		boolean attack2 = super.attack(opponent);
		boolean attack3 = super.attack(opponent);
		return attack1 || attack2 || attack3;
	}
}
