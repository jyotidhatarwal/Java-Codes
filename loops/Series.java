package loops;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// printing a series 1+ 1/2 + 1/3 +1/4 + .......+ 1/n
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		float result = 0;
		
		for(float i =1; i<=n; i++) {
			result = result + 1/i;
		}
		
		System.out.println(result);
		
	}

}
