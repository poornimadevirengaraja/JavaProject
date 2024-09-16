package construct.chaining.keywords;

public class thisseconduse {

	// The most common use of the this keyword is to eliminate the confusion between
	// class attributes and parameters with the same name
	// class variable or class attributes
	int x;

	// constructor
	thisseconduse(int x) {
		this.x = x;
		/*
		 * if u comment and run this code the output is 0
		 */

		/*
		 * if u uncomment and run this code the output is 1000. so this is used to point
		 * class attributes or variables
		 */

	}

	public static void main(String[] args) {
		thisseconduse ts = new thisseconduse(1000);
		System.out.println(ts.x);

	}

}
 