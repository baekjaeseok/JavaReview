/*
 * 상속을 통한 중복 제거
 */
package Java_Section06;

public class _02_Inheritance {
	public static void main(String[] args) {
		
		Pet dog = new Pet();
		
		dog.name = "골든 리트리버";
		dog.age = 3;
		dog.price = 220000;
		
		System.out.println("[Pet Info]");
		System.out.print(dog.name + ", ");
		System.out.print(dog.age + "세, ");
		System.out.println(dog.price + "원");
		
	}
}

class Animal {
	String name;
	
	public void cry() {
		System.out.println("동물의 울음 소리");
	}
}

class Pet extends Animal {
	
//	 부모 클래스 Animal과 중복되는 필드와 메소드를 제거
//	String name;
	int age;
	int price;
	
//	public void cry() {
//		System.out.println("동물의 울음 소리");
//	}
	
	public void play() {
		System.out.println("움직임");
	}
}

