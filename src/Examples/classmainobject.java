package Examples;

public class classmainobject {
	
	int x=10;
	static Firstclass objnm1=new Firstclass();
	
	public static void method2() {
		
		System.out.println("method2 printed here");
	}
	
	public static void main(String[] args) {
		
		classmainobject objnm=new classmainobject(); // object creation for the class classandmain
		
		
		System.out.println(objnm.x);
		System.out.println(objnm1.y);
		objnm1.method1();
		method2();
		
		//inherited from child class this method3
		objnm1.method3();
	}
	

}
