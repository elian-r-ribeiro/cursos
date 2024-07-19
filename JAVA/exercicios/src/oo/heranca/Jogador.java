package oo.heranca;

public class Jogador {

	public int hp = 100;
	public int x;
	public int y;
	
	public Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	boolean walk(Direcao direction) {

		switch (direction) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y--;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;
	}

	public boolean attack(Jogador opponent) {

		int deltaX = Math.abs(x - opponent.x);
		int deltaY = Math.abs(y - opponent.y);

		if (deltaX == 0 && deltaY == 1) {
			opponent.hp -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			opponent.hp -= 10;
			return true;
		} else {
			return false;
		}
	}
}
