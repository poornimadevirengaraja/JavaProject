package abstraction.fullabstraction.Interface;

public class class2 implements class1 {

	@Override
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("class2 methodOne");
		
	}

	@Override
	public void methodTwo() {
		// TODO Auto-generated method stub
		System.out.println("class2 methodTwo");
		
	}

	@Override
	public void methodThree() {
		// TODO Auto-generated method stub
		System.out.println("class2 methodThree");
		
	}
	public static void main(String[] args) {
		
		class2 c = new class2();
		c.methodOne();
		c.methodTwo();
		c.methodThree();
	}

	

}
