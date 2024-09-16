package oopsconcepts;


public class classesandobjects  {
	
	//object creation	
	//static word is for memory allocation
	//classname objectname=new classname();
	/* Object ? why used ? - You can also create an object of a class and access it in another class. 
	 (one class has all the attributes and methods, while the other class holds the main() method (code to be executed)).*/
	static classesandmethods objname=new classesandmethods();
	
	
	
	//method creation
	public static void method1() {
		System.out.println("Test"); //sysout+ctrl+space
		objname.method3(); // object method calling
//	method3();
	}
	
		
	/* Main Method*/
	/* Main method - It is used only to execute the java code */
	/* syntax -  accessmodifier  static returntype mainmethod(string[] ars) */
	
	/* public is Access Modifier to allow access where and who can access methods */
	/* If the main method is not public, it’s access is restricted */
	/* private and protected or default can be used but it will not run error will occur */
	
	
	/*The word static can call only static methods*/
	/*dynamic can call only dynamic methods*/
	/* static word - It is used to alert the memory and not to waste memory when main() method is invoked */ 
	/* static is used for class-related methods*/
	/* Main Method will give error if static word is not given for memory allocation for main */
	
	
	/* void - In Main Method it will not return anything so void is given if it is not void it will give error*/

	/* String [] arguments is a java array of String objects. 
	 * This means that the main function expects an array of Strings. 
	 * This array of strings typically holds all command line parameter arguments passed in when the program is run from the command line */
	
	//overriding method interest()
	public static void interest() {		
		System.out.println("main class");		
	}
	
	public static void main(String[] args) {
		/* we can execute inside this*/
		method1();
		objname.parentclassmethod();// from parent class all data's can be inherited to child class
		
	}
	
	
	
	

}
