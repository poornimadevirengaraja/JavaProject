package construct.chaining.keywords;
/* This - It points to current class
 * This keyword should be used in the very first line immediately after the constructor
 * We can not use more than one this in a constructor
 * */

public class constructrthis {

	constructrthis() {
		this(60); // it will call line15 method
		System.out.println("default constructor"); // third this will be printed

	}

	constructrthis(int a) {
		this(34, "Kingofscorpion"); // this will call line21 method
		System.out.println("constructor with int :" + a); // second this will be printed

	}

	constructrthis(int a, String b) {
		System.out.println("constructor with int :" + a + " " + b); // first this will be printed
	}

	public static void main(String[] args) {
		constructrthis ct = new constructrthis();

	}

}
