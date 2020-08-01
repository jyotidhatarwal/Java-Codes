package PriorityQueue;

import java.util.PriorityQueue;

public class MainClass {

	
	
	
	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("pineapple");
		pq.add("orange");
		pq.add("Apple");
		pq.add("Banana");
		pq.add("Kiwi");
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
