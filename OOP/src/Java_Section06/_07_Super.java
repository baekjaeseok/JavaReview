package Java_Section06;

public class _07_Super {
	public static void main(String[] args) {
		
		Monster m = new Monster("몬스터", 0, 0, 0);
		System.out.println(m.toString());
		
		Undead um = new Undead();
		um.name = "스파토이";
		um.hp = 120;
		um.mp = 30;
		um.dmg = 15;
		um.weapon = "언월도";
		
		System.out.println(um.toString());
	}
}

class Monster {
	protected String name;
	protected int hp;
	protected int mp;
	protected int dmg;
	
	public Monster() {
		
	}

	public Monster(String name, int hp, int mp, int dmg) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.dmg = dmg;
	}
	
	public String toString() {
		return String.format("name : %s, hp : %d, mp :%d, dmg : %d", this.name, this.hp, this.mp, this.dmg);
	}
}

class Undead extends Monster {
	protected String weapon;
	
	public Undead() {
		
	}
	
	@Override
	public String toString() {
		return String.format("name : %s, hp : %d, mp :%d, dmg : %d, weapon : %s" , super.name, super.hp, super.mp, super.dmg, this.weapon);
	}
}