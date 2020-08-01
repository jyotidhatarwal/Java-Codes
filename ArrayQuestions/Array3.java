package ArrayQuestions;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
		
		int array[] = new int[n];
		for(int i =0;i<n;i++) {
			array[i] = sc.nextInt();
			
		}
		System.out.println("MAX: " + maxOf(array,n));
		System.out.println("MIN: " + minOf(array,n));
		
	}
	
	public static int maxOf(int[] array ,int n) {
	
		return Arrays.stream(array).max().getAsInt();
		
	}
	public static int minOf(int[] array,int n) {
		return Arrays.stream(array).min().getAsInt();
	
	
		
	}
	
	
		
	}


