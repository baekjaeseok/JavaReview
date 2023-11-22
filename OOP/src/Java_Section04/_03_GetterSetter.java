package Java_Section04;

public class _03_GetterSetter {
	public static void main(String[] args) {
		
		// Person user = new Person("홍길동", "010-1234-5678");
		Person user = new Person("홍길동", "010-1234-5678");
		
		user.setName("홍**");
		user.setPhone("010-****-8355");
		
		System.out.println("이름 : " + user.getName());
		System.out.println("연락처 : " + user.getPhone());
	
	}
}

class Person {
	// 필드
	private String name;
	private String phone;
	
	// 생성자
	public Person() {
		
	}
	
	public Person(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// Getter
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}