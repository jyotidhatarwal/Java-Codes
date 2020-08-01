package Inheritance;

public class Teacher extends Person {
	// calling the constructor
	public Teacher(String name) {
		super(name);
		System.out.println("inside teacher constructor");
		
	}
	//
	public void teach() {
		System.out.println("he can teach");
	}
	public void eat() {
		super.eat();
		System.out.println("teacher "+ name + " is eating");
	}
	public static void laughing() {
		System.out.println("person is laughing");
	}

}
