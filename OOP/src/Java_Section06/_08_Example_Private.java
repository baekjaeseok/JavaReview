/*
 * 클래스의 연속 확장
 * 클래스의 필드를 private
 */
package Java_Section06;

import java.util.ArrayList;

public class _08_Example_Private {
	public static void main(String[] args) {
		
		// 객체 생성 & 업캐스팅(부모클래스 타입으로 해석)
		Ud skull = new Ud("해골", 100);
		Ud spatoy = new Spatoy("스파토이", 200, 30);
		Ud deathNight = new DeathNight("데스나이트", 1500, 300, 100);
		
		ArrayList<Ud> monster = new ArrayList<Ud>();
		monster.add(skull);
		monster.add(spatoy);
		monster.add(deathNight);
		
		System.out.println("[언데드 몬스터 정보]");
		for (int i = 0; i < monster.size(); i++) {
			System.out.println(monster.get(i).toString());
		}
	}
}

class Ud{
	private String name;
	private int hp;
	
	public Ud (String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public String toString() {
		return String.format("[언데드 몬스터] NAME: %s, HP: %d", getName(), getHp());
	}
}

class Spatoy extends Ud{
	private int mp;
	
	public Spatoy (String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}	
	
	public int getMp() {
		return mp;
	}
	
	@Override
	public String toString() {
		return String.format("[언데드 몬스터] NAME: %s, HP: %d, MP: %d", getName(), getHp(), getMp());
	}
}

class DeathNight extends Spatoy {
	private int amor;
	
	public DeathNight (String name, int hp, int mp, int amor) {
		super(name, hp, mp);
		this.amor = amor;
	}
	
	public int getAmor() {
		return this.amor;
	}
	
	@Override
	public String toString() {
		return String.format("[언데드 몬스터] NAME: %s, HP: %d, MP: %d, AMOR : %d", getName(), getHp(), getMp(), getAmor());
	}
}