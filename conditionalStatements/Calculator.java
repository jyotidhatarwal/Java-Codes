package conditionalStatements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
Scanner sc = new Scanner(System.in);
System.out.println("enter first number");
int a = sc.nextInt();
System.out.println("enter second number");
int b = sc.nextInt();

System.out.println("enter the operation");
sc.nextLine();
char operation = sc.nextLine().charAt(0);

switch(operation) {
case '+':
	result = a + b;
	break;
case '-':
	result = a - b;
	break;
case '*':
	result = a * b;
	break;
case '/':
	result = a / b;
	break;
default:
System.out.println("invalid operation");

	

}
System.out.println("the result is "+ result);
	}

}
