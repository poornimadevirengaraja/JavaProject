package oops.polymorphism.overloading;

public class driverclass {
	
	public static void main(String[] args) {
		//As it is static methods it is invoked by classname
		System.out.println(multiplication.multiply("poornima"));
		System.out.println(multiplication.multiply(12, 5));
		System.out.println(multiplication.multiply(10, 20, 30));
		System.out.println(multiplication.multiply(12.89,345.78));
		System.out.println(multiplication.multiply(123.789, 3456.890));
		
		//object created for sub class here to see if it is overloading methods executing
		subclass c3=new subclass();
		System.out.println(c3.multiply(10, 10, 10, 10));
		
		// You can try this making multiplication methods to final
		// if final method u can invoke methods using objects not using classname.
		/* multiplication m=new multiplication();
		m.multiply(15, 100); */
		
		
	}

}
