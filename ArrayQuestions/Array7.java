package ArrayQuestions;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int [] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println(countoccurances(array,n,x));
		

	}
	public static int countoccurances(int[] array, int n, int x) {
		int result = 0;
		for(int i=0;i<n;i++) {
			if(x == array[i]) {
				result ++;
				
				
			}
		}
		return result;
	}

}
