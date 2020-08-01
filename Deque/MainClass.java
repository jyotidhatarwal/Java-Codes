package Deque;

import java.util.ArrayDeque;

public class MainClass {
	
	
	
	public static void main(String[] args) {
		
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(99);
		ad.addFirst(98);
		
		ad.pop();
	
		ad.peek();
		ad.push(97);
		ad.push(990);
		System.out.println(ad);
		MyDeque<Integer> md = new MyDeque<>();
		md.addtohead(87);
		md.addtohead(95);
		md.removelast();
		System.out.println(md);
	}

}
