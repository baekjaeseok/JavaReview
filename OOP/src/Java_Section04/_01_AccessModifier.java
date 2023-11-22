/* MEMO
 * 접근제한자
 * private : 비공개(외부 접근을 막는 키워드)
 * default : 같은 패키지 내 공개
 * protected : 상속 범위 공개
 * public : 공개
 * 
 * getter : 비공개 필드를 우회하여 가져옴
 * setter : 비공개 필드를 우회하여 변경함
 */

/* 객체의 정보를 외부로부터 보호하지 않는 경우, 데이터가 함부로 변경될 수 있다.
 * 이러한 문제를 예방하기 위해, 적절한 접근 제한자가 필요하다.
 */

package Java_Section04;
public class _01_AccessModifier {
	public static void main(String[] args) {
		
		// 계좌 생성
		Account myAccount = new Account(1000000);
		System.out.println("해킹 전 "+ myAccount.toStr());
		
		// 계좌 해킹
		Hacker.malcious(myAccount);
		
		// 계좌 해킹 후 결과 출력
		System.out.println("해킹 후 "+ myAccount.toStr());
	}
	
}

class Account {
	
	int balance; // 디폴트 접근 제한자 -> 같은 공간 클래스에게 공개
	
	public Account(int balance) {
		this.balance = balance;
	}
	
	public String toStr() {
		return "계좌 잔액 : " + this.balance;
	}
}

class Hacker {
	
	public static void malcious(Account account) {
		account.balance = 0;
	}
}