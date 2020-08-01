package Deque;

public class MyDeque<E> {	// here we are implementing a deque of our own

	
	Node<E> head, tail;

		
		public void addtohead(E data) {
			Node<E> toadd = new Node<>(data);
			
			if(head == null) {
				head = tail = toadd;
				return;
			}
			
			head.next = toadd;
			toadd.prev = head;
			head = toadd;
			
		}
		
		public void  removelast() {
			
			if(head == null) {
				return;
			}
			Node<E> toremove = tail;
			tail = tail.next;
			tail.prev = null;
			
			if(tail == null) {
				head = null;
			}
			toremove.next = null;
			
		}
		public static class Node<E>{
		E data;
		Node<E> next, prev;
		public Node(E data) {
			this.data = data;
			this.next = this.prev = null;
			
		}
	}
}
