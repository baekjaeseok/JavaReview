package Java_Section05;

import java.util.ArrayList;

public class _04_ArrayList {
	public static void main(String[] args) {
		
		// String을 담을 수 있는 ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kim");
		list.add("Lee");
		list.add("Park");
		list.add("Choi");
		list.add("Jung");
		
		for (String i : list) {
			System.out.println(i);
		}
		
	}
}

