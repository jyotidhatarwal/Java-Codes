package Methods;
import java.util.Scanner;
public class Introduction {

	public static void main(String[] args) {
		// calling the method
		//first name of the method then pass the arguments 
		Scanner sc = new Scanner(System.in);
		int  firstnumber = sc.nextInt();
		int secondnumber = sc.nextInt();
		int result = maxOf(firstnumber,secondnumber);
		System.out.println(result);
		
		sayhi();

	}
	// first we create the method then we call it
	// also static functions can be called only in static functions
	// creating a method/function
	// first tell the return type then method name and its arguments 
static int maxOf(int a, int b) {
		if(a>b) {					// return a>b ? a: b;
			return a;
		}else {
		
		return b;
		}
	}
static void sayhi() {
	System.out.println("Hi");
	System.out.println("good morning");
}

}
