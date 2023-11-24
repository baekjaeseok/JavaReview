/*
 * 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
 * 다형성 - 하나의 객체가 다양한 타입으로 해석되는것
 */
package Java_Section07;

public class _02_Interface {
	public static void main(String[] args) {
		
		HolyKnight hk = new HolyKnight("아라곤", 100);
		
		// 다형성
		Tanker t = hk;
		t.increaseHp();
		System.out.println(t.toString());
		// t.toString()은 Tanker 인터페이스 타입인 t 변수를 통해 HolyKnight 객체의 toString() 메소드 호출

		hk.beAttacked();
		System.out.println(hk.toString());
				
		Healer h = hk;
		h.heal();
		System.out.println(h.toString());
		
	}
}

interface Tanker {
	public void increaseHp();
}

interface Healer {
	public void heal();
}

// 구현체 클래스
class HolyKnight implements Tanker, Healer {
	private String name;
	private int hp;
	
	public HolyKnight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public void beAttacked() {
		System.out.println("공격을 당했습니다");
		this.hp -= 20;
	}
	
	@Override
	public void increaseHp() {
		System.out.println("체력이 증가합니다");
		this.hp += 50;
	}
	
	@Override
	public void heal() {
		System.out.println("체력을 회복합니다");
		this.hp += 10;
	}
	
	@Override
	public String toString() {
		return String.format("이름: %s, 체력: %d", this.name, this.hp);
	}
}