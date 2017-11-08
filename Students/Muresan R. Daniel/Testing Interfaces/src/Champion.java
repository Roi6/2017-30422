
public class Champion implements Upgradable {
	private int attackDamage;
	private int armor;
	private int stamina;

	public Champion(int attackDamage, int armor, int stamina) {
		this.attackDamage = attackDamage;
		this.armor = armor;
		this.stamina = stamina;
	}

	public void upgrade() {
		this.attackDamage += 50;
		this.armor += 10;
		this.stamina += 20;
	}

	public int getAttackDamage() {
		return this.attackDamage;
	}

	public int getArmor() {
		return this.armor;

	}

	public int getStamina() {
		return this.stamina;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
