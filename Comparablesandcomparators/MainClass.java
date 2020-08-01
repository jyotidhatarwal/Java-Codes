package Comparablesandcomparators;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23,"Ram"));
		students.add(new Student(100,"Shyam"));
		students.add(new Student(100,"madhav"));
		Collections.sort(students);
		students.forEach(System.out::println);

	}

}

class sortbynamethenmarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
			return o1.marks - o2.marks;
		}else {
			return o1.name.compareTo(o2.name);
		}

	}
	
}
