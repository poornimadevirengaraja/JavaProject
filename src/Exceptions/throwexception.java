package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//custom exception
/* Throw ?
 * 1) throw keyword is used to throw an exception explicitly.
 * 2) We can throw either checked or unchecked exceptions in Java by throw keyword. 
 * 3) It is mainly used to throw a custom exception.
 * 4) throw will come inside a method and it will handle only one exception at a time
 * 
 * syntax:
 * ********
 * throw new exception_classname("error message");  
 * here exception_classname is unchecked or checked exceptions like StringIndexOutOfBoundsException,ArithmeticException,IOException etc
 */
public class throwexception {

	public static void main(String[] args) {

		/* Example 1- Throw used for unchecked exceptions */
		throw new ArrayIndexOutOfBoundsException("The person is not eligible to vote");
		// throw new NullPointerException("The person is not eligible to vote");

	}
}
