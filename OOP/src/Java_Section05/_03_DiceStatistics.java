/* MEMO
 * 배열에 카운팅하는것
 * 이중 FOR문
 */
package Java_Section05;

import java.util.Random;

public class _03_DiceStatistics {
	public static void main(String[] args) {
		
		int[] stat = new int[13]; // 0~12
		
		for (int i = 0; i < 100; i++) {
			int diceA = Dice.roll();
			int diceB = Dice.roll();
			
			stat[diceA + diceB]++;
		}
		
		System.out.println("[주사위의 합]");
		for (int i = 2; i < stat.length; i++) {
			if (i < 10) {
				System.out.print("0" + i + " -> ");
			} else {
				System.out.print(i + " -> ");
			}
			for (int j = 0; j < stat[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}

class Dice {
	public static int roll() {
		Random rd= new Random();
		int Dice = rd.nextInt(6) + 1;
		return Dice;
	}
}