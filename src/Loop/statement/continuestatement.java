package Loop.statement;
/*
 * continue : if the condition is true then it skips one iteration and go to the next iteration
 */
public class continuestatement {
public static void main(String[] args) {
	
	for(int i=1;i<=10;i++) {
		if(i==5) {
			continue; // it skips the 5 and goes to next iteration 
		}
		System.out.println(i);
		
	}
}
}
