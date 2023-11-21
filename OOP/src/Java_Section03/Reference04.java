/* MEMO
 * 클래스 변수 vs 인스턴스 변수
 * 클래스 변수란 static 키워드가 필드에 적용된 것을 말한다.
 * 인스턴스 변수란 non-static 필드(static이 없는 일반적인 필드)를 말한다.
 */
package Java_Section03;

public class Reference04 {
	public static void main(String[] args) {
		
		// 5칸 크기의 객체 배열 생성
		Galaxy[] phones = new Galaxy[5];
		
		// 배열 속 객체 할당
		for (int i = 0; i < phones.length; i++) {
			phones[i] = new Galaxy();
		}
		
		// 모든 객체 정보 출력
		for (int i = 0; i < phones.length; i++) {
			phones[i].print();
		}
		
		System.out.println("==================");
		
		// Galaxy 객체의 개수를 클래스 변수로 출력
		System.out.println("Galaxy 객체의 개수 : " + Galaxy.count);
		
	}
}

class Galaxy {
	
	public static int count = 0;
	public String serialNum;
	
	public Galaxy() {
		count++;
		char c = randomAlphabet();
		serialNum = String.format("%c-%d", c, count);
	}
	
	// A to Z
	public char randomAlphabet() {
		return (char)('A' + Math.random() * 26);
	}
	
	public void print() {
		System.out.println("Galaxy serial number : " + serialNum);
	}
}