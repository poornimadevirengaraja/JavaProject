package Exceptions;

public class multiplecatchblockexception {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			System.out.println(a[7]); //ArrayIndexOutOfBounds Exception
			a[5] = 30 / 0; //Arithmetic Exception
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds Exception occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
