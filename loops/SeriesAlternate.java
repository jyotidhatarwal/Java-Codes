package loops;
import java.util.Scanner;
public class SeriesAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
	
		
		float result = 0;

		
		for(float i=1; i<=n; i=i+1) {
			if(i % 2 ==0) {
			result = result - 1/i;
		} else {
			result = result + 1/i;
			
		}
		

		
	}
		System.out.println(result);
	}
}