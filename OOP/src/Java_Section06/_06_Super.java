/*
 * super
 * 자식 객체를 생성과 동시에 초기화 하려면, 먼저 부모의 생성자가 호출 되어야 한다.
 * 
 * 만약 부모 클래스에 매개변수가 있는 생성자만 정의되어 있다면,
 * 자식 클래스의 생성자에서는 super(매개변수)를 사용하여 
 * 부모 클래스의 매개변수가 있는 생성자를 명시적으로 호출해야 한다. 그렇지 않으면 컴파일 오류가 발생한다.
 */
package Java_Section06;

public class _06_Super {
	public static void main(String[] args) {
		
		Orc o = new Orc("오크", 80);
		System.out.println(o.toString());
		
		OrcWarrior ow = new OrcWarrior("오크전사", 120, 3);
		System.out.println(ow.toString());

	}
}

class Orc {
	protected String name;
	protected int hp;
	
	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return String.format("Orc { name : %s, hp : %d }", this.name, this.hp);
	}
}

class OrcWarrior extends Orc {
	protected int amor;
	
	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}
	
	@Override
	public String toString() {
		return String.format("Orc { name : %s, hp : %d , amor : %d }", super.name, super.hp, this.amor);
	}
}
