/* MEMO
 * 1. OOP : 자전거(프로그램) = 몸체(객체) + 바퀴(객체) + 핸들(객체)
 * 
 * 2. OOP의 장점 : 관리 용이, 재사용, 확장성
 * 
 * 3. CLASS = FIELDS(상태) + METHODS(동작)
 */

package Java_Section01;

public class OOP_01 {
	public static void main(String[] args) {
		
		// Dog 클래스 객체 생성
		Dog dog = new Dog();
		
		dog.name = "흰둥이";
		dog.breed = "래브라도 리트리버";
		dog.age = 3;
		
		// Dog 객체 필드 값 출력
		System.out.println("이름 : " + dog.name);
		System.out.println("품종 : " + dog.breed);
		System.out.println("나이 : " + dog.age);
		
		// Dog 객체 메소드 호출
		dog.wag();
		dog.bark();
		
		System.out.println("===============");
		
		// Cat 클래스 객체 생성
		Cat cat = new Cat();
		cat.name = "네로";
		cat.breed ="페르시안";
		cat.age = 2;
		
		// Cat 객체 필드 값 출력
		System.out.println("이름 : " + cat.name);
		System.out.println("품종 : " + cat.breed);
		System.out.println("나이 : " + cat.age);		
		
		// Cat 객체 메소드 호출
		cat.claw();
		cat.meow();
	}
}

class Dog {
	// 필드(상태) 영역
	String name;
	String breed;
	int age;
	
	// 메소드(동작) 영역
	public void wag() {
		System.out.println(this.name + "의 살랑살랑 꼬리치기");
	}
	
	public void bark() {
		System.out.println(this.name + "의 크르릉 왈왈!");
	}
}

class Cat {
	// 필드(상태) 영역
	String name;
	String breed;
	int age;
	
	// 메소드(동작) 영역
	public void claw() {
		System.out.println(this.name + "의 할퀴기! 슥샥!");
	}
	
	public void meow() {
		System.out.println(this.name + "의 야옹~");
	}
}

