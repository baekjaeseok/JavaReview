/*
 * 메소드 오버라이딩 : 부모의 메소드를 자식클래스에서 재정의 하는 것
 */
package Java_Section06;

public class _04_Override {
	public static void main(String[] args) {
		Square s = new Square();
		s.name = "정사각형";
		s.length = 5;

		Triangle t = new Triangle();
		t.name = "삼각형";
		t.base = 4;
		t.height = 3;
	
		Circle c = new Circle();
		c.name = "원";
		c.radius =4;
		
		// 업 캐스팅 - 도형의 배열에 정사각형, 삼각형, 원 담기
		Shape[] shapes = {s, t, c};
		
		// 모든 도형의 넓이 계산 및 출력
		for (int i = 0; i < shapes.length; i++) {
			Shape tmp = shapes[i];
			System.out.println(tmp.name + "의 넓이 : " + String.format("%.2f",  tmp.area()));
		}
	}
}

class Shape {
	String name;
	
	public double area() {
		return 0;
	}
}

class Square extends Shape {
	int length;
	
	@Override
	public double area() {
		return length * length;
	}
}

class Triangle extends Shape {
	int base;
	int height;
	
	@Override
	public double area() {
		return (base * height) / 2;
	}
}

class Circle extends Shape {
	int radius;
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
}
