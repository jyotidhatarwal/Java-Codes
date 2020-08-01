package ArrayQuestions;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			
		
		}
		for(int i=0;i<n-1;i++) {
			boolean sorted = true;
			for(int j=0;j<n-1;j++) {
				if(array[j+1] < array[j]) {
					int x = array[j+1];
					array[j+1] = array[j];
					array[j] =x;
					sorted = false;
				}
			}
			if(sorted)
				break;
		}
		for(int sortedarray: array) {
			System.out.println(sortedarray);
		}
		
	}

}
