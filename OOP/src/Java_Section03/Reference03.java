/* MEMO
 * 한 객체 내부에 또 다른 객체들이 존재할 수 있다.
 * 하나의 팀에 여러 선수들이 존재하는 것과 같다. 
 */
package Java_Section03;

public class Reference03 {
	public static void main(String[] args) {
		
		// 한국 선수 객체 생성
		PlayersInfo kim = new PlayersInfo("Kim", new int[] {9, 8, 10});
		PlayersInfo lee = new PlayersInfo("Lee", new int[] {10, 9, 10});
		PlayersInfo park = new PlayersInfo("Park", new int[] {8, 10, 9});
		
		// 중국 선수 객체 생성
		PlayersInfo xiao = new PlayersInfo("Xiao", new int[] {10, 9, 10});
		PlayersInfo yu = new PlayersInfo("Yu", new int[] {8, 9, 10});
		PlayersInfo xui = new PlayersInfo("Xui", new int[] {8, 9, 9});
		
		// 나라별 선수 객체 배열 만들기
		PlayersInfo[] koreaPlayers = {kim, lee, park};
		PlayersInfo[] chinaPlayers = {xiao, yu, xui};
		
		// 나라별 팀 객체 만들기
		TeamsInfo teamKorea = new TeamsInfo("한국", koreaPlayers);
		TeamsInfo teamChina = new TeamsInfo("중국", chinaPlayers);
		
		teamKorea.TeamsTotalScore();
		teamChina.TeamsTotalScore();
		
	}
}

class PlayersInfo {
	String name;
	int[] shotPoint;
	
	public PlayersInfo(String name, int[] shotPoint) {
		this.name = name;
		this.shotPoint = shotPoint;
	}
	
	// 선수의 스코어 총점
	public int playerTotalScore() {
		int totalScore = 0;
		for (int i = 0; i < shotPoint.length; i++) {
			totalScore += shotPoint[i];
		}
		return totalScore;
	}
}

class TeamsInfo {
	String nation;
	PlayersInfo[] nPlayer;
	
	public TeamsInfo(String nation, PlayersInfo[] nPlayer) {
		this.nation = nation;
		this.nPlayer = nPlayer;
	}
	
	public void TeamsTotalScore() {
		int totalScore = 0;
		for (int i = 0; i < nPlayer.length; i++) {
			totalScore += nPlayer[i].playerTotalScore();
		}
		System.out.println(nation + "팀의 총점 : " + totalScore);
	}
}
