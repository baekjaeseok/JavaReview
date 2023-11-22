package Java_Section04;

public class _05_This {
	public static void main(String[] args) {
		
		// 커피 객체 생성
		Coffee coffee = new Coffee("아메키라노", 1500);
		System.out.println("커피값 인상 전 : " + coffee.getName() + " " + coffee.getPrice());
		
		// 커피 값 인상 1500 -> 1800
		coffee.setPrice(1800);
		System.out.println("커피값 인상 후 : " + coffee.getName() + " " + coffee.getPrice());
		
	}
}

class Coffee {
	
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}

