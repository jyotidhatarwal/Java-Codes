package Queue;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<Integer> Q = new LinkedList<>();
		Q.add(23);
		Q.add(99);
		Q.add(98);
		System.out.println(Q);
		
		System.out.println(Q.remove());
		System.out.println(Q.remove());
		System.out.println(Q.element());
		System.out.println(Q.remove());
		
		//Q.remove();
		System.out.println(Q.poll());
		
		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(97);
		mq.enqueue(89);
		mq.enqueue(100);
		System.out.println(mq.dequeue());

	}

}
