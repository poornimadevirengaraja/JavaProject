package polymorphism;

public class overloadingmainclass {

	
	//object creation for polymorphism
	static overloadingmethods polyobj=new overloadingmethods();
	
	public static void main(String[] args) {	
		
		
		//polymorphism - over loading of methods
		polyobj.Addition();
		polyobj.Addition(10, 20);
		polyobj.Addition(100, 200, 300);
		polyobj.Addition(1000,2000,3000,4000);
		polyobj.Addition(12,155.19, 345.34);
		
		//You can also call a method from another class like classname.methodname, by making the method should be static
		//overloadingmethods.Addition(10,400);
		
		
		
		
		
	}

}
