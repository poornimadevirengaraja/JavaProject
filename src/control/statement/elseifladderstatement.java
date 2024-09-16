package control.statement;

/*if (condition1) {
	  // block of code to be executed if condition1 is true
	} else if (condition2) {
	  // block of code to be executed if the condition1 is false and condition2 is true
	} else {
	  // block of code to be executed if the condition1 is false and condition2 is false
	}*/

public class elseifladderstatement {
	public static void main(String[] args) {
		String city = "delhi";
		if (city == "chennai") {
			System.out.println("city is chennai");
		} else if (city == "delhi") {
			System.out.println("city is delhi");
		} else if (city == "guntoor") {
			System.out.println("city is guntoor");
		} else {
			System.out.println("city is not listed here");
		}
	}

}
