package Java_Section07;

import java.util.ArrayList;

public class _05_Example_Interface {
	public static void main(String[] args) {
		
		// 업캐스팅
		Sounding dog = new Dog();
		Sounding baby = new Baby();
		Sounding tiger = new Tiger();
		Sounding robot = new Robot();
		
		Sounding[] arr = {dog, baby, tiger, robot};
		
		System.out.println("[배열]");
		for (int i = 0; i < arr.length; i++) {
			arr[i].sound();
		}
		System.out.println();
		
		ArrayList<Sounding> list = new ArrayList<Sounding>();
		list.add(dog);
		list.add(baby);
		list.add(tiger);
		list.add(robot);
		
		System.out.println("[ArrayList]");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).sound();
		}
		
	}
}

interface Sounding {
	public void sound();
}

class Dog implements Sounding {
	
	@Override
	public void sound() {
		System.out.println("Dog: 멍멍!");
	}
}

class Baby implements Sounding {
	
	@Override
	public void sound() {
		System.out.println("Baby: 응애!");
	}
}

class Tiger implements Sounding {
	
	@Override
	public void sound() {
		System.out.println("Tiger: 어흥!");
	}
}

class Robot implements Sounding {
	
	@Override
	public void sound() {
		System.out.println("Robot: 삐빕!");
	}
}