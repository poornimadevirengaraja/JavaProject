package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * throws ?
 * 1) It is used to declare an exception
 * 2) It gives information to the programmer there may exception occur in this program
 *so it is better that programmer can write an exception handling code to get a normal flow of program without stopping.
 *
 *Syntax:
 ********
 *returntype methodname() throws exceptionclassname{  
 	//method code  
	}  
* Which exception should be declared? or to be used throws?
* Ans: Checked exception only
 */
public class throwsexception {
	public void methodOne() throws FileNotFoundException  { // It gives information to the programmer there may exception occur in this program
		FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
		BufferedReader fileInput = new BufferedReader(file);
		System.out.println("Good"); // It will not come to this line also; error in line 23		
	}
	
	public static void main(String[] args) {
		

	/* Example 2- Throw used for checked exceptions - FileNotFoundException */
	throwsexception t = new throwsexception();
	//Error handled using try catch so execution will not stop
	// if try catch not used then execution will stop due to this exception
	try {
		t.methodOne();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("rest of the code...");    
	  System.out.println("Exception handled and going to next code");  
}

}