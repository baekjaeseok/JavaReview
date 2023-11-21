package Java_Section02;

public class Constructor_03 {
	
	public static void main(String[] args) {
		
		// 기본생성자
		Hero hero1 = new Hero();
		hero1.name = "아이언맨";
		hero1.hp = 80;
		
		Hero hero2 = new Hero();
		hero2.name = "타노스";
		hero2.hp = 160;
		
		// 매개변수를 가진 생성자
		Hero hero3 = new Hero("토르", 150);
		
		Hero hero4 = new Hero("그루트", 40);
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
		System.out.println(hero3.toString());
		System.out.println(hero4.toString());
	}
}

class Hero {
	
	String name;
	int hp;
	
	// 기본생성자
	public Hero() {
		
	}
	
	// 매개변수를 가진 생성자
	public Hero(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	@Override
	public String toString() {
		return "Hero [name=" + this.name + ", price=" + this.hp + "]";
	}
}