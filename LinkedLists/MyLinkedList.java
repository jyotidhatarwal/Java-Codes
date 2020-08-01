package LinkedLists;

public class MyLinkedList<E> {	// here we created our own linked list and did not use the one given by eclipse
	
	Node<E> head;
	
	void add(E data) {	// making a method for adding
		Node<E> toAdd = new Node(data);		// creating the object for for node
		
		//checking if the list is empty or not
		
		
		if(head == null) {
			head = toAdd;
			return;
		}
		//
		// traversing in the linked list
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		//temp.next = toAdd;
	}
	
	void print() {
		Node <E>temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
	}
	
	static class Node<E>{
		public Node(E data2) {
			// TODO Auto-generated constructor stub
		}
	
		Node<E> next;
		
		public Node<E> (E data) {		// making a constructor
			this.data = data;
			next = null;
		}
	}

}
