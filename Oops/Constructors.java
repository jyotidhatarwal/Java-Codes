package Oops;
class vehcile{
	
	int wheels;
	
	// no arguments constructor
	
	vehcile(){	// this is the constructor of the class vehcile
		
		wheels = 4;
		
	}
	
	
	
	
}
class ride{
	
	int wheel;
	int headlights;
	String color;
	
	// parametrized constructor
	
	ride(int noOfWheels){
		wheel = noOfWheels;
		headlights = 2;	//since this is constant for every ride so we will not paramterized this 
		
	
		
	}
	
	// here we are making multiple constructors
	ride(int wheel,String color){		// constructor overloading
		// when we know the color of vehicle the above constructor is called and when we don't then this constructor is called
		
		this.wheel = wheel;
		this.color = color;
		headlights = 2;
		
		
		
	}
	
	
	
	
}
//

public class Constructors {
	
	Constructors(){
		System.out.println("object is now created");
		
	}

	public static void main(String[] args) {
		
		Constructors obj = new Constructors();
		vehcile car = new vehcile();
		vehcile car1 = new vehcile();
		System.out.println(car1.wheels);
		//car.wheels = 5;
		System.out.println(car.wheels);
		
		
		
		// for parametrized constructor
		
		ride bike = new ride(2);
		ride cars = new ride(4);
		System.out.println(bike.wheel);
		
		//
		
		// constructor overloading vala part ka print kr rahe hai
		
		ride erikshaw = new ride(3 , "yellow");
		System.out.println(erikshaw.color);

	}

}
