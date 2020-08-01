package Interface;

public class Person implements Student,Youtuber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person obj = new Person();
		obj.study();
		obj.makevideo();

	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is studying");
		
		
	}

	@Override
	public void makevideo() {
		// TODO Auto-generated method stub
		System.out.println("person is making videos");
	}

}
