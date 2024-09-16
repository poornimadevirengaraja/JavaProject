package modifiers.accessmodifiers.pkg2;

import modifiers.accessmodifiers.pkg1.class1;


public class class3 extends class1 {
	public static void main(String[] args) {
		class3  c3= new class3();// object created for class3
		
		//variables - access modifiers called here
		System.out.println(c3.cprotected); // extends the class1 superclass from another package.You need to import the superclass package. 
		System.out.println(c3.bpublic); // anywhere can be accessed
		
		//methods - access modifiers called here
		c3.methodPublic();// anywhere can be accessed
		c3.methodProtected(); // extends the class1 superclass from another package.You need to import the superclass package. 
	}
	
	

}
