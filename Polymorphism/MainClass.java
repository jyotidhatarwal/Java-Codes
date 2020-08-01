package Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog d = new dog();
		Pet p = d;
		//Animal a = d;
		d.walk();
		p.walk();
		System.out.println(d.name);
		System.out.println(p.name);
		
		greeting();
		
	}

	public static void greeting() {		// compile time polymorphism = method overloading
		System.out.println("hi there");
	}
	public static void greeting(String s) {
		System.out.println(s);
	}
	
}
