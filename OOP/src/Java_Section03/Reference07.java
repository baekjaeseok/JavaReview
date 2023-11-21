/* MEMO
 * 두 점 사이의 거리
 * 이차원 평면상의 두점 A(0, 0)와 B(3, 4)의 거리 구하기
 */
package Java_Section03;

public class Reference07 {
	public static void main(String[] args) {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		
		double distance = Point.distance(p1, p2);
		// System.out.println(distance);
		System.out.println("두 점 A"+ p1.toString() + ", B" + p2.toString() + "의 거리 : " + distance);
	}
}

class Point {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static double distance(Point p1, Point p2) {
		double result = Math.sqrt((p2.x - p1.x)^2 + (p2.y - p1.y)^2);
		return result;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ", " + this.y + ")";
	}
}

