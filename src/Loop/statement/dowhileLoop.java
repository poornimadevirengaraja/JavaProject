package Loop.statement;
/*do while loop:
 * =============
 * It is similar to while loop but the different is that
 * it executes the code block inside do, at least once before checking the while condition. 
	syntax:
	 =========
	 do {
	  // code block to be executed
		}
	while (condition);

 */
public class dowhileLoop {
	public static void main(String[] args) {
		int i=5;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
		
	}

}
