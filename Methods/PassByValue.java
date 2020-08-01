package Methods;

public class PassByValue {

	public static void main(String[] args) {
//	int c = 34;
//	int d = 99;
//	swap(c,d);
//	System.out.println(c +" " +d);
		
//		dog c = new dog();
//		c.legs = 4;
//		dog d = new dog();
//		d.legs = 5;
//		
//		swap(c,d);
		
		dog a = new dog();
		a.legs = 4;
		changedog(a);
		System.out.println(a.legs);
		

	}
	
	
	// creating the method for swaping the numbers
	static void swap(int a, int b) {
		int x = a;
		a=b;
		b=x;
	}
	static void swap(dog a, dog b) {
		dog y =a;
		a=b;
		b=y;
	}
	static void changedog(dog dogi) {
		dogi.legs = 6;
		
	}

}

class dog{
	int legs;
	
}