package ArrayQuestions;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
		}
		maximum(array,n);
		minimum(array,n);
		System.out.println(maximum(array,n) - minimum(array,n) );
	}
	
	public static int maximum(int[] array, int n) {
		return Arrays.stream(array).max().getAsInt();
	}
	
	public static int minimum(int[] array, int n) {
		return Arrays.stream(array).min().getAsInt();
	}

}
