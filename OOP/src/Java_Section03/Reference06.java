package Java_Section03;

public class Reference06 {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(0, 0, 3);
		Circle circle2 = new Circle(2, 3, 5);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
	}
}

class Circle {
	
	int x;
	int y;
	int r;

	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public double area(int r) {
		double area = r * r * Math.PI;
		return area;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + "), 반지름이 " + this.r + "인 원의 넓이 : " + area(this.r);
	}
}