package polymorphism;
//method overriding
	// same method used in child class as given in parent class
	// here home loan interest rate differs with personal loan interest rates 
	// if there is a class for home loan ( child class )  and in that interest() method will be there
	// if there is a class for personal loan ( parent class) and in that interest() method will be there
	
//rules//
//method must have same name as in parent class//
//method must have same parameter in parent class//
//there should be relationship between the classes through inheritance//
//method overriding will not happen for static or final methods//
//so don't mention static or final while overriding methods//
// This is called run time polymorphism//
// This require inheritance//
// takes place in different classes //

public class overriddingmainclass {
	
	public static void main(String args[]) {
		//Example1 - Overriding
		// object creation for child class
		SBIclasschild s=new SBIclasschild();
		HDFCclasschild h= new HDFCclasschild();
		ICICIclassChild i= new ICICIclassChild();	

		System.out.println(s.getrateofinterest());
		System.out.println(h.getrateofinterest());
		System.out.println(i.getrateofinterest());


		//Example 2 - Run time polymorphism - overridden child class

		//Run Time Polymorphism or overridden child class
		// Object creation parent class assigned to child class
		// child class is overridden or child class is called during runtime - run time polymorphism
		//	In this example, we are creating two classes Bankclassparent and SBIclasschild. SBIclasschild class extends Bankclassparent class and overrides its run() method. 
		//	We are calling the run method by the reference variable of Parent class. 
		//	Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.
		//	Since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.
		Bankclassparent b;
		b=new SBIclasschild();
		System.out.println(b.getrateofinterest()); 
		b=new HDFCclasschild();
		System.out.println(b.getrateofinterest()); 
		b=new ICICIclassChild();	
		System.out.println(b.getrateofinterest()); 

	}

	

	
	
}
