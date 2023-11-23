/*
 * 상속을 통한 클래스 확장
 */
package Java_Section06;

public class _01_Inheritance {
	public static void main(String[] args) {
		
		Novice novice = new Novice();
		novice.name = "프로도";
		novice.hp = 100;
		
		Wizard wizard = new Wizard();
		wizard.name = "사루만";
		wizard.hp = 120;
		wizard.mp = 100;
		
		novice.punch();
		wizard.punch();
		
		wizard.fireball();
	}
}

class Novice {
	
	String name;
	int hp;
	
	public void punch() {
		System.out.println(this.name + "의 펀치!");
	}
}

class Wizard extends Novice{ // Novice 상속 : String name, int hp, punch() 

	int mp;
	
	public void fireball() {
		System.out.println(this.name + "의 파이어볼");
	}
}
