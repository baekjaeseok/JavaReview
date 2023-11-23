/*
 * protected : 상속 관계의 클래스까지 접근을 허용
 */
package Java_Section06;

public class _05_Protected {
	public static void main(String[] args) {
		Sports sports = new Sports();
		sports.name = "스포츠";
		
		Basketball basketball = new Basketball();
		basketball.name = "농구";
		
		Soccer soccer = new Soccer();
		soccer.name = "축구";
		
		PingPong pingpong = new PingPong();
		pingpong.name = "탁구";

		Sports[] sportsList = {sports, basketball, soccer, pingpong};
		
		for (int i = 0; i < sportsList.length; i++) {
			Sports temp = sportsList[i];
			System.out.println(temp.description());
		}
		
	}
}

class Sports {
	protected String name;
	
	public String description() {
		return name + "는 여가 / 경기 / 체력 단련 등을 위한 신체 운동입니다.";
	}
}

class Basketball extends Sports {
	@Override
	public String description() {
		return name + "는 공을 던져 골을 넣는 운동이다.";
	}
}

class Soccer extends Sports {
	@Override
	public String description() {
		return name + "는 공을 차서 골을 넣는 운동이다.";
	}	
}
	
class PingPong extends Sports {
	@Override
	public String description() {
		return name + "는 공을 번갈아가며 주고 받는 운동이다.";
	}	
}