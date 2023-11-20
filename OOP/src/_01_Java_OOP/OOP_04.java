/* MEMO
 * 정사각형 클래스를 구현하려 한다. 이는 한변의 길이를 가지며,
 * 그 넓이를 반환할 수 있다.
 */
package _01_Java_OOP;

public class OOP_04 {
	public static void main(String[] args) {
		
		// Square 객체 생성
		Square square = new Square();
		
		square.length = 5;
		
		square.printArea();
		
	}
}

class Square {
	int length;
	
	public int area() {
		 int result = this.length * this.length;
		 return result;
	}
	
	public void printArea() {
		System.out.println("한변의 길이가 "+ this.length + "인 정사각형의 넓이는 " + area() + "이다.");
	}
}
