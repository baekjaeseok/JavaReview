/*
 * 업캐스팅 : 자식 객체를 부모의 타입으로 해석하는 것
 * 다양한 객체들을 부모의 타입으로 관리할 수 있다
 * 
 * Animal cat = new Cat();
 * Animal dog = new Dog();
 * Animal horse = new Horse();
 * 
 * Animal[] animals = {cat, dog, horse};
 */
package Java_Section06;

public class _03_Upcasting {
	public static void main(String[] args) {
		
		// Knight 객체 생성
		Knight knight = new Knight();
		knight.name = "기사";
		knight.hp = 200;
		knight.strength = 50;
		
		// Thief 객체 생성
		Thief thief = new Thief();
		thief.name = "도적";
		thief.hp = 120;
		thief.agility = 40;
		
		// 업 캐스팅 - 부모타입으로 객체를 해석
		Adventurer advenK = knight;
		Adventurer advenT = thief;
		
		// 배열 생성
		Adventurer[] advs = {advenK, advenT};
		
		// 모든 정보 출력
		for (Adventurer i : advs) {
			System.out.println(i.toString());
		}
	}
}

class Adventurer {
	String name;
	int hp;
	
	public void punch() {
		System.out.println(this.name + "의 펀치!!");
	}
	
	public String toString() {
		return this.name + "의 HP : " + this.hp;
	}
}

class Knight extends Adventurer {
	int strength;
	
	public void berserker() {
		System.out.println("체력과 공격력이 증가합니다");
	}
}

class Thief extends Adventurer {
	int agility;

	public void sharpen() {
		System.out.println("치명타 확률이 증가합니다");
	}
}