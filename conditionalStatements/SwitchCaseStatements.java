package conditionalStatements;
import java.util.Scanner;

public class SwitchCaseStatements {
	
public static void main(String[] args) {
//	int dayOfWeak = 1;
//	
//switch(dayOfWeak) {
//case 1:
//	System.out.println("i'm on leave");
//	break;
//case 2:
//	System.out.println("i'm in office");
//	break;
//
//	default:
//		System.out.println("i'm tired");
//	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the rating");
	int rating = sc.nextInt();
	switch(rating) {
	case 1:
	case 2:
		System.out.println("bad review");
		break;
	case 3:
		System.out.println("Average review");
		break;
	case 4:
	case 5:
		System.out.println("good review");
		break;
	
	
	
}




}



}
