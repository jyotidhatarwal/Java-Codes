package conditionalStatements;
import java.util.Scanner;
public class NestedIfElse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the numbers");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	int result = 0;
	//using terniary operator
	
	result = a > b ? a > c ? a : c : b > c ? b : c;
	
//	if(a > b) {
//		if(a > c) {
//			result = a;
//		}
//		else {
//			result = c;
//		}
//	}else {
//		if(b > c) {
//			result = b;
//		}else {
//			result =c;
//		}
//	
//	}

System.out.println("the result is " + result);
}

}
