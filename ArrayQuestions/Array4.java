package ArrayQuestions;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			reverse(array,n);
			
		}
		

	}
	public static void reverse(int [] array, int n) {
		int i=0;
		int j;
		j=i-1;
		while(i<j) {
			int temp = array[i];
			array[i] =array[j];
			array[j] = temp;
			i++;
			j--;
			
		}
	}
	
	
}
