/* MEMO
 * Constructor (생성자) : 객체 생성, 초기화
 */
package Java_Section02;

public class Constructor_01 {
	public static void main(String[] args) {
		
		Bicycle b1 = new Bicycle("삼천리 자전거", 21.74, 899000);
		Bicycle b2 = new Bicycle("한국 자전거", 26.84, 785000);
		
		System.out.println(b1.name);
		System.out.println(b1.weight + "kg");
		System.out.println(b1.price + "원");
		
		System.out.println();
		
		System.out.println(b2.name);
		System.out.println(b2.weight + "kg");
		System.out.println(b2.price + "원");
	}
}

class Bicycle {
	
	String name;
	double weight;
	int price;
	
	// 기본생성자
	public Bicycle() {
	}
	
	// 생성자 - 파라미터를 통한 초기화
	public Bicycle(String name, double weight, int price) {
		super();
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
}
