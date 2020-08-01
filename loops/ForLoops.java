package loops;
import java.util.Scanner;
public class ForLoops {
	public static void main(String[] args) {
		
//		for(int i = 0; i <= 100; i = i+2) {
//			System.out.println(i);
			
		//}
		// for finding the sum of n numbers
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number");
//		int sum =0;
//		int n = sc.nextInt();
//		for(int i = 0; i<= n; i = i+1  ) {
//			sum = sum + i;
//			
//		}
//		
//		System.out.println("the sum is " + sum);

	
	
	
	
	// for decrementing
		
//	for(int i=100; i>0; i=i-1) {
//		System.out.println(i);
//	}
	
	//making a mathematical table
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the table number");
//		int n = sc.nextInt();
//		for(int i=1; i<=10; i = i+1) {
//			System.out.println(i*n);
//		}
	//factorial of a number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int n = sc.nextInt();
		int product = 1;
		
		for(int i=1; i<=n; i++) {
			product = product*i;
			System.out.println("the factorial is " + product );
			
		}
		System.out.println("the factorial is " + product );
	}
	

}
