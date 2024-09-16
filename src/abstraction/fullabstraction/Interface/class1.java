package abstraction.fullabstraction.Interface;

/* Abstraction
************
Hiding the implementation details - Business logic */

/*2 types
=====
Partial abstraction - Abstraction
Fully abstraction - Interface
*/

/*Interface
 =========
It use a keyword interface in class
It contains only the abstract methods 
Interface methods will not have body or return type
Interface method is by default abstract and public
we can't create object for interface
It use a keyword implements

Can implement multiple interfaces*/

public interface class1 {
	
	public void methodOne(); //  example of Interface method is by default abstract and public
	void methodTwo(); //  example of Interface method is by default abstract and public
	public abstract void methodThree();

}
