package Arrays;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dimensions");
		int rows = sc.nextInt();
		int column = sc.nextInt();
		
		int a[][] = new int[rows][column];
		int b[][] = new int[rows][column];
		System.out.println("enter array a");
		for(int i =0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				a[i][j] = sc.nextInt();
				
			}
		}
		System.out.println("enter array b");
		for(int i =0; i<rows;i++) {
			for(int j=0;j<column;j++) {
				b[i][j] = sc.nextInt();
				
			}
		}
		int c[][] = new int[rows][column];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				c[i][j] = a[i][j] + b[i][j];
				
			}
		
		}
		System.out.println("result array c");
		for(int i =0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				System.out.print("  "+ c[i][j]);	
			}
			System.out.println();
		}

		
		
	}

}
