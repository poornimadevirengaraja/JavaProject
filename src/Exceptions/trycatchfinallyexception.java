package Exceptions;

import java.util.Scanner;

/*
 * Try ?
 * The "try" keyword is used to specify a block where we should place an exception code. 
 * It means we can't use try block alone. 
 * The try block must be followed by either catch or finally.
 * 
 * catch?
 * The "catch" block is used to handle the exception. 
 * It must be preceded by try block which means we can't use catch block alone. 
 * It can be followed by finally block later.
 * 
 * finally?
 * The "finally" block is used to execute the necessary code of the program. 
 * It is executed whether an exception is handled or not.
 * 
 * throw? It is just used to throw an exception
 * 
 * throws?
 *  It specifies that exception may occur in this method. 
 *  It doesn't throw an exception. It is used to just declare an exception.
 *  It is always used with method signature.
 *  
 *  
 *  Try and Catch is Possible
 *  Try and Finally is possible
 *  Try, catch and Finally is possible
 *  Try alone is not possible
 *  catch alone is not possible
 *  catch and Finally is not possible
 */
public class trycatchfinallyexception {
	public static void main(String[] args) {
		
		try {
			int i=12/0; //java.lang.ArithmeticException
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		try {
			String s = "Fita"; 
			System.out.println(s.charAt(4)); // java.lang.StringIndexOutOfBoundsException:
		} catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		
		try {
			Scanner sc = new Scanner(System.in); int a = sc.nextInt();
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); //java.util.InputMismatchException
			System.out.println(e);
		}
		/* Try Catch Finally*/
		try {
			int a[] = new int[3]; 
			System.out.println(a[5]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage()); //java.lang.ArrayIndexOutOfBoundsException
			System.out.println(e);
		}finally {
			System.out.println("Code of Exception Handling is executed successfully");
		}
		
		// Try and Finally
		try {
			int a[] = new int[3]; 
			System.out.println(a[1]);
		} finally {
			// TODO: handle finally clause
			System.out.println("Code of Exception Handling is executed successfully");
			
		}
		
	}

}
