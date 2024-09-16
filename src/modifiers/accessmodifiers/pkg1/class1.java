package modifiers.accessmodifiers.pkg1;

//Access Modifier ?
//==================
//It controls the accessibility levels (or) scope of the attributes, method, class or constructor in java.

/*4 Types:
 * ======
1) Default
2) public
3) private
4) Protected*/

/*
1) Default - 	The code or class  can be accessed only with in the same package. 
			 	No access modifier is specified.
2) Public  -  	The code or class can be accessed anywhere.
3) Protected - 	The code or class can be accessed with in the same package and also outside the package.
 			   	Outside the package, it can be accessed in its subclasses using 'extends' keyword or through inheritance.
 			   	The package of superclass needs to be imported in the subclass in another package.
4) Private 	 - 	The code or class can be accessed with in the same class.

*/

public class class1 {
	// variables declared using access modifiers
	private String aprivate="private";  //The code or class can be accessed with in the same class.
	public String bpublic="public"; 
	protected String cprotected="protected";
	String ddefault="default";
	
	// Methods using access modifiers
	private void methodPrivate() {
		System.out.println("This is methodPrivate");
	}
		
	public void methodPublic() {
		System.out.println("This is methodPublic");
	}
	
	protected void methodProtected() {
		System.out.println("This is methodProtected");
	}
		
	void methodDefault() {
		System.out.println("This is methodDefault");
	}
	
		
	public static void main(String[] args) {
		class1 c1=new class1(); // object created for class1
		
		//variables - access modifiers called here.
		System.out.println(c1.aprivate);//The code or class can be accessed with in the same class.
		System.out.println(c1.ddefault);
		System.out.println(c1.cprotected);
		System.out.println(c1.bpublic);
		
		//methods - access modifiers called here.
		c1.methodPrivate();
		c1.methodPublic();
		c1.methodProtected();
		c1.methodDefault();
	}
	
}
