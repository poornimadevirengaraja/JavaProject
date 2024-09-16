package abstraction.partialabstraction.Abstract;
// extends keyword used to extend abstract class
public class class2 extends class1 {

	// class2 is a normal class 
	// methodThree() is a normal method can have return type
	public void methodThree() {
		System.out.println("Method three");
	}
	
	@Override // methodTwo() is a abstract override method cannot have return type
	public void methodTwo() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("method Two : " + c);		
	}
	
	public static void main(String[] args) {
		class2 c2=new class2(); // object c2 created to call the methods from class
		c2.methodOne();
		c2.methodTwo();
		c2.methodThree();
		
	}

}
