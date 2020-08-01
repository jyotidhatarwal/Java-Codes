package ArrayQuestions;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int array[] = new int[m];
		for(int i=0;i<m;i++) {
			array[i] = sc.nextInt();
		
		if(n == array[i]) {
			System.out.println(true);
		}else if(n!= array[i]) {
			System.out.println(false);
		}
	}
		
	}

}
