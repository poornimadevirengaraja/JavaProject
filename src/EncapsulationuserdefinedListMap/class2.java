package EncapsulationuserdefinedListMap;

/* 
 * encapsulation using List<class> - wrapper class here is class1 which is fully encapsulated class
 * this class is to test the encapsulated class > class1 crating a List<class1>
 */
import java.util.ArrayList;
import java.util.List;

public class class2 {
	public static void main(String[] args) {
		
		List<class1> l = new ArrayList<>();
		
		class1 c1 = new class1();
		c1.setCustomerID(1);
		c1.setCustomerName("ABC");
		
		class1 c2 = new class1();
		c2.setCustomerID(2);
		c2.setCustomerName("DEF");
		
		class1 c3 = new class1();
		c3.setCustomerID(3);
		c3.setCustomerName("GHI");

		l.add(c1);
		l.add(c2);
		l.add(c3);
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getCustomerID());
			System.out.println(l.get(i).getCustomerName());
		
		}
		
		
		


	}

}
