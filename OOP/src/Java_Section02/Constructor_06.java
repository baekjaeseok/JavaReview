/* MEMO
 * 짐레이너(마린)이 스팀팩 사용시 HP 10 감소 
 * 모랄레스(메딕)이 힐 사용시 MP10 감소 + 짐레이너(마린)의 HP 10증가
 */
package Java_Section02;

public class Constructor_06 {
	public static void main(String[] args) {
		// 객체 생성
		Unit marine = new Unit("짐레이너", 80);
		
		Unit medic = new Unit("모랄레스", 60, 60);
		
		// 마린의 스팀팩
		marine.stimPack(marine);
		
		// 메딕의 힐
		medic.heal(medic, marine);
	}
}

class Unit {
	
	String name;
	int hp;
	int mp;
	
	public Unit() {
		
	}
	
	public Unit(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	public Unit(String name, int hp, int mp) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	
	public void stimPack(Unit marine) {
		System.out.print("[" + marine.name + "]의 스팀팩!  HP : " + marine.hp);
		marine.hp -= 10;
		System.out.println(" -> " + marine.hp);
	}
	
	public void heal(Unit medic, Unit marine) {
		System.out.println("[" + medic.name + "]의 힐!");
		System.out.print("[" + marine.name + "]의 HP : " + marine.hp);
		marine.hp += 10;
		System.out.println(" -> " + marine.hp);
		System.out.print("[" + medic.name + "]의 MP : " + medic.mp);
		medic.mp -= 10;
		System.out.println(" -> " + medic.mp);
	}	
}
