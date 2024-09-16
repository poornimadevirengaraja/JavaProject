package Constructor;

public class constructor {
	
	// Difference between interview QA -- > method and constructor 
	// what is polymorphism?
	// DB overloading and overriding??
	// can overloading happen for final or static ? yes 
	// can overriding happen for final ? NO
	// can overriding happen for static? No
	
	/* constructor*/
	// method name is same as class name
	// no return type
	// constructor can't be static or final or abstract  - it will not hold more data - method overriding will not happen final 
	// method overriding will not happen for constructor
	// constructor is similar to method overloading
	
	// purpose - just for initialization & constructor is invoked implicitly & it is called when instance of class is created or called when object creation
	//At the time of calling constructor, memory for the object is allocated in the memory.
	
	
	
	//default constructor is not mandatory
	//It is not necessary to write a constructor for a class. 
	//It is because java compiler creates a default constructor if your class doesn't have any.
	//where 0 or null values are provided for default constructor
	public  constructor() {
		
		System.out.println("default constructor");
		
	}
	
	//Parameterized constructor
	public  constructor(int x) {
		
		System.out.println(x);
		
	}

}
