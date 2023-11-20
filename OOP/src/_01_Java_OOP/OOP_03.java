/* MEMO
 * 1. 클래스 스코프 : 필드
 * 2. 메소드 스코프 : 파라미터, 지역변수
 */

package _01_Java_OOP;

public class OOP_03 {
	public static void main(String[] args) {
		DrinkMachine dm1 = new DrinkMachine();
		DrinkMachine dm2 = new DrinkMachine();
		
		dm1.pushButton(2);
		dm1.printOutput();

		dm2.pushButton(0);
		dm2.printOutput();
		
	}
}

class DrinkMachine {
	String output;
	
	public void pushButton(int num) {
		String[] drink = {"코라콜라", "펩시", "칠성사이다", "밀키스", "환타"};
		this.output = drink[num];
	}
	
	public void printOutput() {
		System.out.println(this.output);
	}
}
