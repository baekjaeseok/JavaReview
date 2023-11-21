package Java_Section03;

public class Reference02 {
	public static void main(String[] args) {

		int[] kimShot = { 10, 9, 9, 8 };
		int[] leeShot = { 9, 10, 9, 9 };
		int[] parkShot = { 10, 9, 10, 10 };

		Player kim = new Player("Kim", kimShot);
		Player lee = new Player("Lee", leeShot);
		Player park = new Player("Park", parkShot);

		Player[] players = {kim, lee, park};

		for (int i = 0; i < players.length; i++) {
			players[i].printTotalPoints();
		}
	}
}

class Player {

	String name;
	int[] point;

	public Player(String name, int[] point) {
		this.name = name;
		this.point = point;
	}

	// 획득 점수 출력
	public void printTotalPoints() {
		System.out.println(this.name + " : " + totalPoints() + "점");
	}

	// 획득 점수 계산
	public int totalPoints() {
		int totalPoint = 0;
		for (int i = 0; i < point.length; i++) {
			totalPoint += point[i];
		}
		return totalPoint;
	}
}
