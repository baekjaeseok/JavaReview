package Java_Section01;

public class OOP_02 {
	public static void main(String[] args) {
		
		// Bicycle 객체 b1, b2 생성
		Bicycle b1 = new Bicycle();
		Bicycle b2 = new Bicycle();
		
		b1.name = "로드형 자전거";
		b1.weight = 7.25;
		b1.price = 326000;
		
		b2.name = "산악형 자전거";
		b2.weight = 10.68;
		b2.price = 429000;
		
		System.out.println("b1 -> " + b1.name  + ", "+ b1.weight + ", "+ b1.price);
		System.out.println("b2 -> " + b2.name  + ", "+ b2.weight + ", "+ b2.price);
		
	}
}

class Bicycle {
	String name;
	double weight;
	int price;
	
	public void move() {
		System.out.println("자전거를 타고 이동합니다.");
	}
	
	public void horn() {
		System.out.println("따르릉! 지나갈께요~");
	}
}
