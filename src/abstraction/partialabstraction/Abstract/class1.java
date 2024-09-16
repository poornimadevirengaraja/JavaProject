package abstraction.partialabstraction.Abstract;
/* Abstraction
==============
Hiding the implementation details - Business logic */
/*2 types
=========
Partial abstraction - Abstraction
Fully abstraction - Interface
*/
/* Abstract class ?
 * ==============
It is a restricted class that can't be used to create object 
 */
/* Abstract Method ?
 =================
A method declared using the abstract keyword within an abstract class and 
does not have a definition ( implementation or body or no return type ) is called an abstract method*/
/*Partial abstraction - Abstract 
=================================
1) It contains both abstract methods and non abstract methods
2) It use a keyword 'abstract' in both class and methods
3) We can't create object or it can't be instantiated
4) It don't have any default return type
5) It contains keyword extends
*/
public abstract class class1 {
	
	//non abstract method - which has a body
	public void methodOne() {
		System.out.println("method One");
	}
	
	//abstract method - which has no body - no return type 
	public abstract void methodTwo();
	
	/* 3) We can't create object or it can't be instantiated
	 * public static void main(String[] args) { 
	 * class1 c1=new class1(); 
	 * }
	 */
	
}
