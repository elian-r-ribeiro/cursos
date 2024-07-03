package rpgMonsterFight;

public class Player {
	String name;
	int hp;

	public Player(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void playerTookDamage(int damage) {
		this.hp -= damage;
	}
	
	void healPlayerLife(int hp) {
		this.hp += hp;
	}
}
