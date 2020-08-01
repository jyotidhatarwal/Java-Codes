package Oops;

public class StaticKeyword {
	
	// static block
	static {
		System.out.println("in block 1");
	}
	static {
		System.out.println("in block 2");
	}
	

	public static void main(String[] args) {
		System.out.println("in main");
		
		Aunderstandingnestedstaticclass objA = new Aunderstandingnestedstaticclass();
		Aunderstandingnestedstaticclass.B objB = objA.new B();
		
//C objC = new Aunderstandingnestedstaticclass.C();
	}

}
