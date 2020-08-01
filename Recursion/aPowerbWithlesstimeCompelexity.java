package Recursion;

public class aPowerbWithlesstimeCompelexity {
	static int stepcount = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(fastpower(3,10000));
System.out.println(stepcount);
	}

	
	static int fastpower(int a , int b) {
	
		stepcount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return fastpower(a*a,b/2);
		}
		return a*fastpower(a,b-1);
	}
}
// ismai time complexity log(n) hogi