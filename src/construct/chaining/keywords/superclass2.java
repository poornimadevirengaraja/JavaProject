package construct.chaining.keywords;

public class superclass2 extends superclass1 {

	public superclass2() {
		super(); // call parent class line5
		System.out.println("Parent class");
	}

	public superclass2(int a) {
		super(2000); // call parent class line9
		System.out.println("Parent class: " + a);
	}

	public superclass2(int a, String b) {
		super(200, "Goodnight");// call parent class line13
		System.out.println("Parent class :" + a + " " + b);
	}

	public static void main(String[] args) {
		superclass2 sc = new superclass2();
		superclass2 sc1 = new superclass2(1000);
		superclass2 sc2 = new superclass2(100, "Goodmorning");
	}

}
