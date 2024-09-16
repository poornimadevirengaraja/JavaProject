package control.statement;

public class ifelsestatement {

	public static void main(String[] args) {

		/*
		 syntax: 
		 ========
		 if (condition) { // block of code to be executed if the condition is true 
		 } else { 
		 // block of code to be executed if the condition is false
		   }
		 */
		
		int x = 100;
		int y = 12;
		if (x > y) {
			System.out.println(x + " this value is greater than " + y);
		} else {
			System.out.println(x + " this value is lesser than " + y);
		}

	}
}