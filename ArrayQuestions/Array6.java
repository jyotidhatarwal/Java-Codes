package ArrayQuestions;

import java.util.Scanner;
import java.util.Arrays;
public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int [] array = new int[n];
		for(int i=0;i<n;i++) {
			array[i] = sc.nextInt();
			
		}
		
		
		for(int i=0;i<n-1;i++) {
			boolean sorted = true;
			for(int j=0;j<n-1;j++) {
				if(array[j+1] < array[j]) {
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					sorted = false;
				}
			}
			if(sorted) {
				break;
			}
		}
//		for(int kthterm: array) {
//			System.out.println(kthterm);
//		}
		
		
		System.out.println(largest(array,k));
		System.out.println(smallest(array,k));
	}
	public static int largest(int[] array,int k) {
		
	
	int targetIndex = array.length - k;
    return array[targetIndex];
	}
	
	public static int smallest(int[] array, int k) {
		int targetindex = k-1;
		return array[targetindex];
	}
}
