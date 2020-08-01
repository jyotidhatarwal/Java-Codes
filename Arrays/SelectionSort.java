package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {6,7,4,2,1,3,-1,9};
int n =a.length;


for(int i=0;i<n-1;i++) {
	
	int minindex = i;
	for(int j=i;j<n;j++) {
		if(a[j] < a[minindex]) {
			minindex = j;
		}
		
	}
	
	int x = a[i];
	a[i]= a[minindex];
	a[minindex] = x;
	
}
for(int item: a) {
	System.out.print(item +" ");
}

	}

}
