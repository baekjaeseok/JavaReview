/*
 * 클래스의 연속 확장
 */
package Java_Section06;

import java.util.ArrayList;

public class _08_Example {
	public static void main(String[] args) {
		
		// [엘프] Name : 티란데, HP : 100
		// [하이엘프] Name : 말퓨리온, HP : 160, MP : 100
		// [엘프로드] Name : 마이에브, HP : 230, MP : 140, SH : 100
		
		// 객체 생성 & 업캐스팅(부모클래스 타입으로 해석)
		Elf elf = new Elf("티란데", 100);
		// HighElf highElf = new HighElf("말퓨리온", 160, 100);
		Elf highElf = new HighElf("말퓨리온", 160, 100);
		// ElfLord elfLord = new ElfLord("마이에브", 230, 140, 100);
		Elf elfLord = new ElfLord("마이에브", 230, 140, 100);

		// 객체 배열 생성
		Elf[] elves = {elf, highElf, elfLord};
		
		// 객체 배열 생성 ArrayList
		ArrayList<Elf> elvesList = new ArrayList<Elf>();
		elvesList.add(elf);
		elvesList.add(highElf);
		elvesList.add(elfLord);
		
		// 출력
		System.out.println("for");
		for (int i = 0; i < elves.length; i++) {
			System.out.println(elves[i].toString());
		}
		System.out.println();
		
		System.out.println("foreach");
		for (Elf i : elves) {
			System.out.println(i.toString());
		}
		System.out.println();
		
		System.out.println("ArrayList 활용");
		for (int i = 0; i < elvesList.size(); i++) {
			System.out.println(elvesList.get(i).toString());
		}
	}
}

class Elf {
	protected String name;
	protected int hp;
	
	public Elf (String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String toString() {
		return String.format("[엘프] Name : %s, HP : %d", this.name, this.hp);
	}
}

class HighElf extends Elf {
	protected int mp;
	
	public HighElf (String name, int hp, int mp) {
		// name, hp
		super(name, hp); // 부모클래스의 생성자 호출
		this.mp = mp;
	}
	
	@Override
	public String toString() {
		return String.format("[하이엘프] Name : %s, HP : %d, MP : %d", super.name, super.hp, this.mp);
	}
}

class ElfLord extends HighElf{
	protected int shield;
	
	public ElfLord (String name, int hp, int mp, int shield) {
		// name, hp, mp
		super(name, hp, mp);
		this.shield = shield;
	}
	
	@Override
	public String toString() {
		return String.format("[엘프로드] Name : %s, HP : %d, MP : %d, SH : %d", super.name, super.hp, super.mp, this.shield);
	}
}