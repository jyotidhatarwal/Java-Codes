package LinkedLists;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		List <Integer> ll = new LinkedList<> ();
		
		List<Integer> al = new ArrayList<>();
		
		ll.add(12);
		ll.add(2);
		ll.add(32);
	
	
		ll.get(1);
		ll.set(1, 13);
		System.out.println(ll);
		System.out.println(ll.get(1));
		
		getTimeDiff(al);
		getTimeDiff(ll);
		
	

	}
	
	static void getTimeDiff(List<Integer> list) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " " + (end - start));
	}

}
