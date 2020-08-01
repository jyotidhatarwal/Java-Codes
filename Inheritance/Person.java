package Inheritance;

public class Person {
	
	protected String name;
	//calling the constructor
	public Person(String name) {
		this.name = name;
		System.out.println("inside person constructor");
		
	}
	//
	
	public void walk() {
		System.out.println(name +"he can walk");
	}
	public void eat() {
		System.out.println(name + "he can eat");
	}

	public static void laughing() {
		System.out.println("person is laughing");
	}
}
