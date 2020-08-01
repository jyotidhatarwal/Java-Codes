package Arrays;
import java.util.Scanner;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of students");
int n = sc.nextInt();
int[] marks = new int[n];
System.out.println("enter the marks");
for(int i=0;i<n; i++) {
	marks[i] = sc.nextInt();	//setting the marks array from user
	
	
}
int average = 0;
for(int i=0;i<n;i++) {
	average = average +marks[i];
	
	
}
average = average/n;	
System.out.println(average);
		
	}

}
