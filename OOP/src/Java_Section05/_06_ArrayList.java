/* MEMO
 * set(int index, E element)
 * ArrayList에 담긴 객체를 변경
 */
package Java_Section05;

import java.util.ArrayList;

public class _06_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Monster> list = new ArrayList<Monster>();
		
		Monster m1 = new Monster("슬라임", 1);
		Monster m2 = new Monster("오크", 3);
		Monster m3 = new Monster("골렘", 8);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println("변경 전");
		for (Monster i : list) {
			System.out.println(i.toString());
		}
		
		// ArrayList의 첫 요소인 슬라임을 토끼로 변경
		m1.setName("토끼");
		list.set(0, m1);
		
		System.out.println("변경 후");
		for (Monster i : list) {
			System.out.println(i.toString());
		}
		
		
	}
}

class Monster {
	private String name;
	private int level;
	
	public Monster(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Monster [name=" + name + ", level=" + level + "]";
	}
	
	
}