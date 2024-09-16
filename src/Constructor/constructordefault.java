package Constructor;

/* 
 * constructor is a block of code and it is a instance of the class
 * Purpose - just for initialization & constructor is invoked implicitly & 
 * It is called when instance of class is created or called when object creation
 * At the time of calling constructor, memory for the object is allocated in the memory.
 * 
 * Rules:
 * *****
 * 1) when a class is called using object creation, constructor is called along with it
 * 2) no explicit return type for the constructor
 * 3) method name should be same as class name
 * 4) Constructor cannot be abstract, final or static ? 
 * 	 Ans : Because in constructor object is created, body is there, can be overloaded, no return type.
 * 5) constructor can be overloaded
 * 6) constructor cannot be override
 * 
 * 2 Types of constructor :
 * 1) Default constructor or no-args constructor
 * 2) Parameterized constructor
 * 
 *  1) Default constructor or no-args constructor
 * default constructor is not mandatory
 * It is not necessary to write a constructor for a class. 
 * It is because java compiler creates a default constructor if your class doesn't have any.
 * where 0 or null values are provided for default constructor
 * 
 *  
 */
public class constructordefault {

	int i;
	String s;

	/*
	 * default constructor provided here Because constructor function returns the
	 * object it creates, not Void. Not even void return type it returns. The
	 * constructor is a special function (for this reason there is no void) that is
	 * executed whenever an object is created.
	 */
	public constructordefault() {
		System.out.println("default constructor");
	}

	/* method */
	void display() {
		System.out.println(i + " " + s);

	}

	public static void main(String[] args) {
		constructordefault c1 = new constructordefault();
		c1.display(); // example of default constructor that displays default value 0 null for int and
						// string

	}

}
