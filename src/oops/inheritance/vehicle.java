package oops.inheritance;
/*
 * inheritance - ? Inheriting attributes and method from one class to another
 * subclass - child class
 * superclass - parent class
 * extends keyword is used to inherit 
 * child class extends super class attributes and  methods
 * if the class is final, then this class can't be extend or inherited
 */
public class vehicle {
//final class vehicle {	 // try with final class
	protected String brand="ford"; // attribute super class
	public void fullygeared() { // method super class
		System.out.println("This vehicle is fullgeared");
	}

}
