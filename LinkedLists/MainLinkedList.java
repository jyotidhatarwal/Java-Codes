package LinkedLists;

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MyLinkedList myll = new MyLinkedList();
		myll.add(99);
		myll.add(89);
		for(int i=0;i<=10;i++) {
			myll.add(i);
			System.out.println(i);
		}
		myll.print();
	}

}
