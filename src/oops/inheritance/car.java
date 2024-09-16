package oops.inheritance;

public class car extends vehicle{
	private String modelname="XX12345";
	
	public static void main(String[] args) {
		car c1=new car(); // object created for child class
		
		System.out.println(c1.modelname);// attribute of this child class
		
		System.out.println(c1.brand); // attribute inherited from vehicle super class
		c1.fullygeared(); // method inherited from vehicle super class
		
	}

}
