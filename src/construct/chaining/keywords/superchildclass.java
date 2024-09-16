package construct.chaining.keywords;

public class superchildclass extends superparentclass {

	public void animalSound() {
		super.animalSound(); // first called
		System.out.println("The animal makes a bow bow sound "); // second called
	}

	public static void main(String[] args) {
		superchildclass sc = new superchildclass();
		sc.animalSound();
	}
}
