package Oops;

class Cat{
	boolean hasFur; // states or properties
	String color,breed;
	int legs;
	
	public void walk() {
		System.out.println("cat is walking");	//behaviour
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	public void description() {
		System.out.println("my cat has "+ legs + "legs");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Cat pucicat = new Cat();
		pucicat.legs = 6;
		pucicat.walk();
		pucicat.description();
		

	}

}
