package Exceptions;

import java.util.Scanner;

/*
 * Exceptions ?  Java Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
 * 
*Two Types of Exceptions - These are called Built-in Exceptions
****************************************************************
* 1) Unchecked Exception - Errors that Occur during run time means after pressing Run button in console u can see this error
* The compiler will not check these exceptions at compile time. the program would not give a compilation error. only  in console u see the error.
* 
* 2) Checked Exception - Checked exceptions are called compile-time exceptions 
* because these exceptions are checked at compile-time by the compiler.
 */
public class uncheckedexceptions {	
	public static void main(String[] args) {
		/*
		 * Arithmetic Exception
		 ***********************/
		/*
		 * int i = 1 / 0; System.out.println(i);
		 */
		
		/*
		 * InputMismatchException if you type string instead of integer it gives
		 * exception in console
		 */
		/*
		 * Scanner sc = new Scanner(System.in); int a = sc.nextInt();
		 * System.out.println(a);
		 */

		//StringIndexOutOfBoundsException:		
		/*
		 * String s = "Fita"; System.out.println(s.charAt(4));
		 */
		//ArrayIndexOutOfBoundsException:
		/*
		 * int a[] = new int[3]; System.out.println(a[5]);
		 */
		
		//NullPointerException
		String s = null;
		System.out.println(s.charAt(1));


	}

}
