package EncapsulationuserdefinedListMap;
/* Encapsulation ?  Process of wrapping code and data into single unit
 * Example: It is Like a capsule. Outer part only we can see and inner part is mixed with medicine which is not visible.
 * 
 * 1) It is a user-defined list, set and map.
 * 2) POJO - Plain Old Java Object
 * 3) we can create fully encapsulated class by making data members inside the class as private. 
 * 4) we can use getter and setter method to get and set the data the class. 
 * 5) By providingtotesttheencapsulatedclass.java only a setter or getter method, you can make the class read-only or write-only
 * 6) It is a way of data hiding because other class will not be able to access the data as it is private data members.
 */

public class class1 {
	
	private String customerName;
	private int customerID;
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	
}
