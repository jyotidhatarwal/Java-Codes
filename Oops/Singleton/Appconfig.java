package Oops.Singleton;

public class Appconfig {
	private Appconfig() {	// we have made the default constructor private
		
	}
	private static Appconfig  obj = new Appconfig();
	
	public static Appconfig getInstance() {
		return obj;
	}
	

}
