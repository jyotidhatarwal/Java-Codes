package Encapsulation;

public class Student {
	private int age;
	private String name;
	
	
	//  getter method this is just used to get the variables
	public int getAge() {
		return age;
	}
	
	// setter method this is just used to set the variables
	
	
	
	//public void setAge(int age){		// this is the required code 
	// this.age = age;
	// }
	
	public void setAge(int age) {		
		if(age>20) {			// here we are just applying a condition according to our choice else this is not necessary
			System.out.println("younare too old too old to be a student in our school");
		}else {
			
		
		this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
}
