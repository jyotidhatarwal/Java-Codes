package conditionalStatements;
import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int maxOfBothNumber = 0;
		maxOfBothNumber = a > b ? a:b ;
		System.out.println(maxOfBothNumber);
		
		
//		if(number<10) {
//			System.out.println("The number is less than 10");
//		} else if(number>10 && number<20) {
//			System.out.println("the number is between 10 and 20");
//		} else {
//			System.out.println("number is greater than 20");
//		}
		
		
	}

}
