package Loop.statement;

/*Loop statement
***************
It is used to execute a block of code repeatedly based on a given condition.

For loop
While loop
Do-while loop
Break statement
Continue statement*/

/*For Loop
It is used when we know the number of iterations in advance
syntax:
=======
for(initialization; condition; increment / decrement){
block of code;
}*/

public class forloopstatement {
	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}

}
