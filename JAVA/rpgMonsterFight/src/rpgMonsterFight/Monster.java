package rpgMonsterFight;

public class Monster {
	String name;
	int hp;

	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	void monsterTookDamage(int damage) {
		this.hp -= damage;
	}
	
	void healMonsterLife(int hp) {
		this.hp += hp;
	}
}
