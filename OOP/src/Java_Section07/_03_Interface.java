/*
 * 인터페이스와 업캐스팅
 * 업캐스팅 - 자식 객체를 부모의 타입으로 해석
 */
package Java_Section07;

public class _03_Interface {
	public static void main(String[] args) {
		
		// 클래스별 객체 생성
		Bird bird = new Bird("새");
		Helicopter helicopter = new Helicopter("헬기");
		Rocket rocket = new Rocket("로켓");

		// 인터페이스 타입으로 그룹화
		Flyable[] flyable = {bird, helicopter, rocket};
		
		// 출력
		for (Flyable i : flyable) {
			i.fly();
		}
		
	}
}

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	private String name;
	
	public Bird(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.printf("<%s>가 날개를 퍼덕이며 날아갑니다!\n", this.name);
	}
}

class Helicopter implements Flyable {
	private String name;
	
	public Helicopter(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.printf("<%s>가 프로펠러를 힘체가 돌리며 날아갑니다!\n", this.name);	
	}	
}

class Rocket implements Flyable {
	private String name;
	
	public Rocket(String name) {
		this.name = name;
	}
	
	public void fly() {
		System.out.printf("<%s>이 제트 엔진을 분출하며 날아갑니다!\n", this.name);
	}	
}