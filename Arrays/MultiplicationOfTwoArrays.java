package Arrays;
import java.util.Scanner;

public class MultiplicationOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dimensions ");
		int row1 = sc.nextInt();
		int column1 = sc.nextInt();
		int row2 = sc.nextInt();
		int column2 = sc.nextInt();
		if(column1 == row2) {
			
		
		
		int a[][] = new int[row1][column1];
		int b[][] = new int[row2][column2];
		
		System.out.println("enter the array a");
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				a[i][j] = sc.nextInt();
				
			}
			
		}
		System.out.println("enter the array b");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<column2;j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("the result array c is ");
		int c[][] = new int[row1][column2];
		for(int i = 0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				c[i][j] = a[i][j] * b[i][j];
				
			}
		}
		for(int i = 0;i<row1;i++) {
			for(int j=0;j<column2;j++) {
				System.out.print(c[i][j] + " ");
				
			}
		}
		}else {
			System.out.println("error");
		}
		System.out.println();
		

	}

}
