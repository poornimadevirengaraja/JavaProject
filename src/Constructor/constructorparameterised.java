package Constructor;

/* 
 * A constructor which has a specific number of parameters is called a parameterized constructor.
 * The parameterized constructor is used to provide different values to distinct objects.
 *  However, you can provide the same values also.
 */
public class constructorparameterised {

	constructorparameterised() {
		System.out.println("default construc");
	}

	constructorparameterised(int a, int b) {
		System.out.println(a + b);
	}

	constructorparameterised(int a, String b, float c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		constructorparameterised cp = new constructorparameterised();

		constructorparameterised cp1 = new constructorparameterised(34, 56);

		constructorparameterised cp2 = new constructorparameterised(23, "good morning", 34);

	}

}
