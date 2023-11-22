/*
 * 외부로 부터 감추기 - private
 */
package Java_Section04;

public class _02_Private {
	public static void main(String[] args) {
		
		// wallet 객체 생성
		Wallet wallet = new Wallet(30000);
		System.out.println(wallet.toString());
		
		// 도둑에게 지갑을 도난 당함
		Thief.steal(wallet);
		
		// 결과 확인
		System.out.println(wallet.toString());
	}
}

class Wallet {
	
	// int money;
	private int money; // 필드를 외부로 부터 감추기 위해 접근 제한자 private 사용
	
	public Wallet(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Wallet [money=" + money + "]";
	}

}

class Thief {
	
	public static void steal(Wallet wallet) {
		// wallet 클래스의 money 필드는 private라 접근 불가
		// wallet.money = 0; 
	}
}