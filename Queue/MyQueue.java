package Queue;
import LinkedLists.MyLinkedList.Node;
public class MyQueue<E> {
	
	private Node<E> head, rear;
	
	public void enqueue(E e) {
		
		//if the queue is empty
		Node<E> toAdd = new Node<>(e);
		if(head == null) {
			head = rear = toAdd;
			return;
		}
		
	
		rear.next = toAdd;
		rear = rear.next;
		
		
	}
	public E dequeue() {
		
		// if queue is empty
		if(head == null) {
			return null;
		}
		
		Node<E> temp = head;
		head = head.next;
		
		if(head == null) {
			rear = null;
		}
		return temp.data;
		
	}

}
