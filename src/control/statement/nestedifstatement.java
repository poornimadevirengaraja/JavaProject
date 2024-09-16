package control.statement;

/*if (condition1) {
    // executes this block if condition1 is true
    
    if (condition2) {
        // executes this block if condition1 and condition2 are both true
    }
}*/
public class nestedifstatement {
	public static void main(String[] args) {
		String place="Chennai,India";		
		if(place.endsWith("India")) {
			if(place.contains("Chennai")) {
				System.out.println("The place is chennai, India ");
			}else {
			System.out.println("The place is different");
			}				
		}else {
			System.out.println("This place does not ends with India");
		}
	}
	

}
