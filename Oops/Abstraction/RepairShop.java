package Oops.Abstraction;

public class RepairShop {
	
	public static void repaircar(Car car) {
		System.out.println("car is repaired");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WagonR w = new WagonR();
		Audi a = new Audi();
		
		repaircar(w);
		repaircar(a);

	}

}
