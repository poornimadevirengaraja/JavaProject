package Loop.statement;

/* Nested Loop
 * ===========
 * It is also possible to place a loop inside another loop. This is called a nested loop.
 */
public class fornestedloopstatement {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
			System.out.println("This is outer loop :" + i);

			for (int j = 1; j <= 3; j++) {
				System.out.println("This is inner loop :" + j);
			}

		}
	}

}
