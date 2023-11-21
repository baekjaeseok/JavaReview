/* MEMO
 * 한 주간 일한 시간
 */
package Java_Section03;

public class Reference01 {
	public static void main(String[] args) {
		
		/*
		 * 배열을 인자로 전달할때는 중괄호를 사용하여 배열을 직접 작성 불가. 배열을 변수로 선언하고 그 변수를 전달해야 한다. 
		 * Employee 객체를 생성하면서 배열을 전달하려면 배열을 먼저 변수로 선언하고 해당 변수를 사용해야한다. 
		 * int[] h0 = {2, 4, 4, 5, 6, 7}; 
		 * Employee emp = new Employee("가", h0);
		 */
		
		// 배열 생성
		int[] h0 = {2, 4, 3, 4, 5, 8, 8};
		int[] h1 = {7, 3, 4, 3, 3, 4, 4};
		int[] h2 = {3, 3, 4, 3, 3, 2, 2};
		int[] h3 = {9, 3, 4, 7, 3, 4, 1};
		int[] h4 = {3, 5, 4, 3, 6, 3, 8};
		int[] h5 = {3, 4, 4, 6, 3 ,4 ,4};
		int[] h6 = {3, 7, 4, 8, 3, 8, 4};
		int[] h7 = {6, 3, 5, 9, 2, 7, 9};
		
		// 객체 생성
		Employee emp0 = new Employee("가", h0);
		Employee emp1 = new Employee("나", h1);
		Employee emp2 = new Employee("다", h2);
		Employee emp3 = new Employee("라", h3);
		Employee emp4 = new Employee("마", h4);
		Employee emp5 = new Employee("바", h5);
		Employee emp6 = new Employee("사", h6);
		Employee emp7 = new Employee("아", h7);
		
//		for (int i = 0; i < emp0.hours.length; i++) {
//			System.out.println(emp0.hours[i]);
//		}
		
		// 객체 배열 생성
		Employee[] employees = {emp0, emp1, emp2, emp3, emp4, emp5, emp6, emp7};
		
		// 정보 출력
		for (int i = 0; i < employees.length; i++) {
			employees[i].printTotalHours();
		}
	}
}

class Employee {
	
	String name;
	int[] hours;
	
	public Employee(String name, int[] hours) {
		super();
		this.name = name;
		this.hours = hours;
	}
	
	// 일한 시간 출력
	public void printTotalHours() {
		System.out.println(this.name + " : " + totalHours() + "시간");
	}
	
	// 일한 시간 계산
	public int totalHours() {
		int sum =0;
		for (int i = 0; i < hours.length; i++) {
			sum += hours[i];
		}
		return sum;
	}
}
