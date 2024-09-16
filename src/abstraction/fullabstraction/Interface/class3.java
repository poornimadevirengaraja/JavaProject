package abstraction.fullabstraction.Interface;

public class class3 implements class1{

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("class3 methodThree");
		
	}

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("class3 methodTwo");
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("class3 methodTwo");
		
	}
	
	public static void main(String[] args) {
		class3 c = new class3();
		c.methodOne();
		c.methodTwo();
		c.methodThree();
	}


}
