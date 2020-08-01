package Oops.ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		fun1();
		
	}
		
			
//		try {
//		int a =5;
//		int b=5;
//		
//		int c = a/b;
//		System.out.println(c);
//		
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage()+" occured, please check your code");
//			
//		}finally {
//			System.out.println("good job");
//		}
//		System.out.println("very important code");
//		System.out.println("need to run");
//		
		
	
	
		
	static void fun1() {
		int a =5;
		int b=3;
		int c= a/b;
		System.out.println(c);
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		
		
	}
	static void fun2() throws ArithmeticException {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArithmeticException("danger was coming");
		}
		
	}

	}


