package loops;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

boolean x = true;

for(int i =2; i*i<=n; i++) {
	if(n%i==0) {
		x = false;
		break;
	}
}
if(n<2) {
	x= false;
}
		System.out.println(x);
	} 

}
