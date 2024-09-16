package modifiers.accessmodifiers.pkg1;

public class class2 {
	public static void main(String[] args) {
		/* object created for class1 
			because no extends is used for class1 here, where class1 has variables and methods declared in it */
		class1 c1=new class1(); 
		
		//variables - access modifiers called here.
		System.out.println(c1.bpublic);
		System.out.println(c1.cprotected);
		System.out.println(c1.ddefault);
		/* 
		 c1.aprivate variable is not accessible in another class 
		because it is Private variable and can be accessed with in the same class
		*/
		
		//methods - access modifiers called here.
		c1.methodDefault();
		c1.methodProtected();
		c1.methodPublic();
		/*c1.methodPrivate() will not get accessed in another class
		 because it is Private method as it can be accessed with in the same class
		 */
	}

}
