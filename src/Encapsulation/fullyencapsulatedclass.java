package Encapsulation;
/* Encapsulation ?  Process of wrapping code and data into single unit
 * Example: It is Like a capsule. Outer part only we can see and inner part is mixed with medicine which is not visible.
 * 
 * 1) It is a user-defined list, set and map.
 * 2) POJO - Plain Old Java Object
 * 3) we can create fully encapsulated class by making data members inside the class as private. 
 * 4) we can use getter and setter method to get and set the data the class. 
 * 5) By providing only a setter or getter method, you can make the class read-only or write-only
 * 6) It is a way of data hiding because other class will not be able to access the data as it is private data members.
 */

public class fullyencapsulatedclass {
	
// Private data members
private long accountno;
private String name,email;
private float amount;


// Public getter and setter methods
// right-click > source > getter and setter methods

public long getAccountno() {
	return accountno;
}
public void setAccountno(long accountno) {
	this.accountno = accountno;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}




}
