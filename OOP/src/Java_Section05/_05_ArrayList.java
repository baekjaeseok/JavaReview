package Java_Section05;

import java.util.ArrayList;

public class _05_ArrayList {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("원피스");
		b1.setPrice(4500);
		
		Book b2 = new Book();
		b2.setTitle("나루토");
		b2.setPrice(4000);
		
		Book b3 = new Book();
		b3.setTitle("슬램덩크");
		b3.setPrice(3500);
		
//		Book b1 = new Book("원피스", 4500);
//		Book b2 = new Book("나루토", 4000);
//		Book b3 = new Book("슬램덩크", 3500);
		
		ArrayList<Book> book = new ArrayList<Book>();
		
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		for (Book i : book) {
			System.out.println(i.toString());
			System.out.println("제목 : " + i.getTitle());
			System.out.println("가격 : " + i.getPrice());
			System.out.println();
		}
	}
}

class Book {
	private String title;
	private int price;
	
	public Book() {
		
	}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
}