/*
 * 로또 번호 생성기
 */
package Java_Section05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08_ArrayList {
	public static void main(String[] args) {
		
		// ArrayList 객체 생성
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		// 1부터 45의 값 담기
		for (int i = 0; i < 45; i++) {
			num.add(i + 1);
		}
		
		// Collections.shuffle()을 활용해 무작위로 섞기
		Collections.shuffle(num);
		
		// 당첨 번호를 저장할 배열 생성
		int[] lotto = new int[6];
		
		// 당첨 번호를 저장하는 배열에 무작위 추첨 번호 6개 담기
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = num.get(i);
		}
		
		// 결과 출력
		// Arrays.toString() : 배열을 문자열로 바꿔주는 메소드
		System.out.println("자동 로또 번호 생성");
		System.out.println(Arrays.toString(lotto));
	}
}
