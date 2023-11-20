/*	MEMO
 * 객체 또한 메소드의 파라미터로 전달 가능
 */
package _02_Java_Constructor;

public class Constructor_05 {
	public static void main(String[] args) {
	
		Avengers thor = new Avengers("토르", 100);
		Avengers thanos = new Avengers("타노스", 9990);
		
		// 토르의 펀치 -> 타노스
		thor.punch(thanos);
		thor.punch(thanos);
		
		// 타노스의 펀치 -> 토르
		thanos.punch(thor);
		thanos.punch(thor);
		thanos.punch(thor);
		
	}
}

class Avengers {
	
	String name;
	int hp;
	
	public Avengers() {
	}
	
	public Avengers(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Avengers [name=" + name + ", hp=" + hp + "]";
	}
	
	// Avengers 객체 타입의 매개변수를 파라미터로 받는다.
	public void punch(Avengers enemy) {
		// 펀치를 날린 주체
		System.out.print(this.name + "의 펀치!!  ");
		
		// 펀치를 맞은 객체
		System.out.print(enemy.name + "의 HP : " + enemy.hp);
		enemy.hp -= 10;
		System.out.println(" -> " + enemy.hp);
	}
}