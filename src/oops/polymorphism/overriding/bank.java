package oops.polymorphism.overriding;
/* 
 * 2) run time polymorphism or dynamic polymorphism  or method overriding
 * =======================================================================
 * method in subclass should have same name, same parameters, same return type as superclass method
 **important ** - can takes place in multiple classes
 * method overriding depends on the object it is used to invoke it
 * If parent class object is used to invoke method then version of super class will be executed 
 * If child class object is used to invoke method then version of sub class will be executed 
 *  This require inheritance using extends
 *  final and static methods can't be overridden - instead public try to change static in bank, sbi and icici and see how it works
 */
//base class bank
public class bank {
	
	public int getrateofinterest() {
		return(5);
	}
}
