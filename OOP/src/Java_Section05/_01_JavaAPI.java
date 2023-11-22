/* MEMO
 * 자바 API : 프로그래밍을 위해 미리 준비된 도구들
 * MATH, RANDOM, ARRAYLIST
 */
package Java_Section05;

import java.util.Random;

public class _01_JavaAPI {
	public static void main(String[] args) {
		
		// 랜덤 객체 생성
		Random rd = new Random();
		
		// 0 이상 n 미만인 임의의 정수
		int n = 10;
		int rdInt = rd.nextInt(n); // 0~9
		System.out.println(rdInt);
		
		// 0.0 이상 1.0 미만의 임의의 실수
		double rdDouble = rd.nextDouble();
		System.out.println(rdDouble);
		
		// 임의의 참 또는 거짓
		boolean rdBoolean = rd.nextBoolean();
		System.out.println(rdBoolean);
	}
}
