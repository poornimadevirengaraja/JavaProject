package oops.polymorphism.overriding;
// This is just the execution class to execute or driver class
public class maindriverclass {
	
public static void main(String[] args) {
	 
	 	// If a Parent type reference refers
	    // to a Parent object, then Parent's - bank's - getrateofinterest() method is called
	    bank obj1 = new bank();
	    System.out.println(obj1.getrateofinterest());
	    
	    // If a Parent type reference refers
        // to a Child object,then  Child's - icici's  - getrateofinterest() method  is called        
	    bank obj2 = new icici();
        System.out.println(obj2.getrateofinterest());
        
        // If a Parent type reference refers
        // to a Child object,then  Child's - sbi's getrateofinterest() method  is called        
	    bank obj3= new sbi();
        System.out.println(obj3.getrateofinterest());
        
        icici obj4=new icici();
        System.out.println(obj4.getrateofinterest());
	    
}
	
	
}
