package Java_Section04;

public class _06_SectionExample {
	public static void main(String[] args) {
		
		Knight knight = new Knight("돈키호테", 30);
		
		System.out.println("[객체 생성]");
		System.out.println( "      knight { name : " + knight.getName() + 
				                   ", hp : " + knight.getHp() + " }");
		
		
		// 체력 증가
		knight.setHp(knight.getHp() + 30);
		
		System.out.println("[체력 증가 + 30]");
		System.out.println( "      knight { name : " + knight.getName() + 
				                   ", hp : " + knight.getHp() + " }");
		
	}
}

class Knight {
	private String name;
	private int hp;
	
	public Knight( ) {
		
	}
	
	public Knight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
}

