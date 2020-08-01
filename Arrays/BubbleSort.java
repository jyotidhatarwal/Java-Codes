package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,-3,6,-7,12,10,5};
		int n = a.length;
		
		for(int i=0; i<n-1;i++) {
			
			boolean sorted = true;
			
			
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int x = a[j+1];
					a[j+1] = a[j];
					a[j] = x;
					sorted = false;
				}
				
			}
			if(sorted) {
				break;
			}
		}
		//for each loop
		for(int item: a) {
			System.out.print(item + " ");
		}

	}

}
