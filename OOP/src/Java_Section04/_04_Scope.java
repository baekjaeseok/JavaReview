/* MEMO
 * 메소드 스코프 : 메소드 내부에서 활동(예 - 파라미터, 지역변수)
 * 클래스 스코프 : 클래스 전역에서 활동(예 - 필드)
 */
package Java_Section04;

public class _04_Scope {
	public static void main(String[] args) {
		// main 메소드의 지역변수 score
		int score = 88;
		System.out.println("score = " + score + " in main()"); // score = 88 in main()
		
		// Record 클래스의 메소드 실행
		Record record = new Record();
		record.record(score); // score = 78 in main()
		
		// main 메소드의 지역변수 score 출력
		System.out.println("score = " + score + " in main()"); // score = 88 in main()	
	}
}

class Record {
	public void record(int score) {
		score -= 10;
		System.out.println("score = " + score + " in record()");
	}
}