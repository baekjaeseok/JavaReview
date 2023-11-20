package _02_Java_Constructor;

public class Constructor_02 {
	public static void main(String[] args) {
		
		Goroke goroke1 = new Goroke("잡채 고로케", 1800);
		Goroke goroke2 = new Goroke("피자 고로케", 2000);
		Goroke goroke3 = new Goroke("야채 고로케", 1700);
		
		System.out.println(goroke1.toString());
		System.out.println(goroke2.toString());
		System.out.println(goroke3.toString());
		
	}
}

class Goroke {
	
	String name;
	int price;
	
	public Goroke() {
		
	}
	
	public Goroke(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goroke [name=" + this.name + ", price=" + this.price + "]";
	}
}