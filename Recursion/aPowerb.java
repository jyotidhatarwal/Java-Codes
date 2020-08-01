package Recursion;

public class aPowerb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(power(3,4));
	}
	
	static int power(int a, int b) {
		if(b==0) {		//base case
			return 1;
		}
		return a*power(a,b-1);			//recursive call yaha humne ek general function bna diya hai
	}
// yeah  jo humne upper kiya hai uski time complexity O(n) hai
}
