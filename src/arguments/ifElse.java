package arguments;

public class ifElse {
 int v=100;
	public void method1() {
		if (v<=100) {
			System.out.println("if condition is met");
		}

		else {
			System.out.println("else condition is not met");
		}
		
	

	}
	
	public void nestedif() {
		if (v<=100) {
			System.out.println("if condition is met");
		}

		else if (v>999) {
			System.out.println("elseif condition is  met");
		}
		else
		{
			System.out.println("else condition is  met");
		}
		
		
	}
}
