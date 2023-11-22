package Java_Section05;

import java.util.ArrayList;

public class _07_ArrayList {
	public static void main(String[] args) {
		// Ramen 객체를 담기 위한 ArrayList 생성
		ArrayList<Ramen> ramenList = new ArrayList<Ramen>();
		
		// Ramen 객체 생성
		Ramen r1 = new Ramen("신라면", 1300);
		Ramen r2 = new Ramen("너구리", 1500);
		Ramen r3 = new Ramen("짜파게티", 1400);
		
		// Ramen 객체를 ArrayList에 담기
		ramenList.add(r1);
		ramenList.add(r2);
		ramenList.add(r3);
		
		// ArrayList에 담긴 모든 객체 정보를 출력
		for (Ramen i : ramenList) {
			System.out.println(i.toString());
		}
		
		// 총합을 출력하시오
		int totalPrice = 0;
		
//		for (Ramen i : ramenList) {
//			totalPrice += i.getPrice();
//		}
		
		for (int i = 0; i < ramenList.size(); i++) {
			totalPrice = ramenList.get(i).getPrice();
		}
		
		System.out.println("총 합 : " + totalPrice);
	}
}

class Ramen {
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}
}