/*
 * Interface
 * 장점 - 프로그램 설계명 명확성, 인터페이스 타입을 통해 연관관계 형성
 * 
 */
package Java_Section07;

public class _01_Interface {
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("Galaxy");
		System.out.println("스마트폰: " + sp.getName());
		sp.beep();
		sp.playMusic("아기상어");
	
	}
}

interface Alarm {
	public void beep();
	public void playMusic(String title);
}

// 구현체 클래스
class SmartPhone implements Alarm {
	private String name;
	
	public SmartPhone (String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void beep() {
		System.out.println("삐빕! 삐비비빕~!");
	}
	
	@Override
	public void playMusic(String title) {
		System.out.println(String.format("[%s]를 재생합니다!", title));
		System.out.println("아기 상어 뚜루루뚜루 귀여운 뚜루루뚜루 바닷속 뚜루루뚜루 아기 상어!");
	}
}