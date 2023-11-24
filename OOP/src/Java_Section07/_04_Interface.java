/*
 * 인터페이스와 ArrayList
 * 다양한 하위 객체들을 상위 인터페이스 타입으로 ArryList에 저장 가능
 */
package Java_Section07;

import java.util.ArrayList;

public class _04_Interface {
	public static void main(String[] args) {
		
		Food food = new Food("족발", 19800);
		Electronics electronic = new Electronics("에어팟", 199000);
		Clothing clothing = new Clothing("셔츠", 49900);
		
		ArrayList<Discount> discountedPrice = new ArrayList<Discount>();
		discountedPrice.add(food);
		discountedPrice.add(electronic);
		discountedPrice.add(clothing);
		
		int totalSum = 0;
		for (int i = 0; i < discountedPrice.size(); i++) {
			Discount temp = discountedPrice.get(i);
			System.out.printf("%s: %d원\n", temp.getName(), temp.dis());
			totalSum += temp.dis();
		}
		System.out.println("==========");
		System.out.printf("총합: %d원", totalSum);
		
	}
}

interface Discount {
	public String getName();
	public int dis();
}

class Food implements Discount {
	private String name;
	private int price;
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int dis() {
		return (int)(this.price * 0.9);
	}
}

class Electronics implements Discount {
	private String name;
	private int price;
	
	public Electronics(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public int dis() {
		return (int)(this.price * 0.8);
	}
}

class Clothing implements Discount {
	private String name;
	private int price;	

	public Clothing(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public int dis() {
		return (int)(this.price * 0.7);
	}	
}