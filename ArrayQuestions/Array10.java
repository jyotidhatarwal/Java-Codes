package ArrayQuestions;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class Array10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));

	}

}
