package Java_Section05;

import java.util.Random;

public class _02_Dice {
	public static void main(String[] args) {
		
		DiceA diceA = new DiceA();
		DiceB diceB = new DiceB();
		
		System.out.println("주사위 A : " + diceA.roll());
		System.out.println("주사위 B : " + diceB.roll());
	}
}

// Math.random()을 이용한 무작위 수 추출
class DiceA {
	public int roll() {
		// 1부터 6사이의 정수
		// Math.random() : 0.0 <= x < 1.0
		double r = Math.random() * 6;
		int randInt= (int)r + 1;
		return randInt;
	}
}

// Random()을 이용한 무작위 수 추출
class DiceB {
	public int roll() {
		Random rd = new Random();
		int randInt = rd.nextInt(6) + 1;
		return randInt;
	}
	
}