package Inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		
		//this is commented becasue of down casting// Teacher t = new Teacher();
		// upcasting or implicit casting
		//this is commented becasue of down casting//   Person p = t;
		//
		
		// downcasting
		Teacher t1 = new Teacher("aman");
		
		Person p = t1;
		Teacher t = (Teacher)p;		// explicitly telling that the person is a teacher
		
		boolean y = t1 instanceof Teacher;
		System.out.println(t1 instanceof Teacher);
		
		
		t.name = "Anuj";
		t.walk();
		t.eat();
		t.teach();
		
		Singer s = new Singer("anuj");
		s.name = "Aman";
		s.sing();
		s.eat();
		

	}

}
