package application.entities;

public class Champion {
	private String name;
	private int life;
	private int attack;
	private int armor;

	public Champion(String name, int life, int damage, int armor) {
		this.name = name;
		this.life = life;
		this.attack = damage;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public String toString() {
		return this.name + " - Ranking(" + this.life * 3 + this.attack * 2 + this.armor + ")";
	}

	public void takeDamage(Champion other) {
		int damage = other.attack - this.armor;

		if (damage > this.life)
			damage = this.life;

		if (damage <= 0)
			damage = 1;

		this.life -= damage;
	}

	public String status() {
		return this.life + " de vida" + (this.life == 0 ? " (morreu)" : "");
	}
}
