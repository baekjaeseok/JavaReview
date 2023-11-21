package Java_Section03;

public class Reference05 {
	public static void main(String[] args) {
		
		// 객체 배열 생성
		FishBread[] breads = new FishBread[4];
		
		breads[0] = new FishBread(0); // 팥
		breads[1] = new FishBread(1); // 고구마
		breads[2] = new FishBread(2); // 치즈
		breads[3] = new FishBread(3); // 슈크림
		// System.out.println(breads.length);
		
		for (int i = 0; i < breads.length; i++) {
			breads[i].print();
		}
		System.out.println("붕어빵 객체의 수 : " + FishBread.count);
		
	}
}

class FishBread {
	
	public static int count = 0;
	public String contents;
	
	public FishBread(int n) {
		String[] arr = {"팥", "고구마", "치즈","슈크림"};
		this.contents = arr[n];
		
		FishBread.count++;
	}
	
	public void print() {
		System.out.println(contents + " 붕어빵");
	}
}
