package EncapsulationuserdefinedListMap;

/* 
 * encapsulation using Map<> - wrapper class here is class1 which is fully encapsulated class
 * this class is to test the encapsulated class > class1 crating a Map<>
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class class3 {
	public static void main(String[] args) {
		 
		Map<Integer, class1> m = new HashMap<>();
		class1 c1 = new class1();
		c1.setCustomerID(123);
		c1.setCustomerName("Java");
		
		class1 c2 = new class1();
		c2.setCustomerID(456);
		c2.setCustomerName("Fita");
		
		class1 c3 = new class1();
		c3.setCustomerID(789);
		c3.setCustomerName("Training");
		
		m.put(1, c1);
		m.put(2, c2);
		m.put(3, c3);
			
		
		Set<Entry<Integer, class1>> e = m.entrySet();		
		for (Entry<Integer, class1> v : e) {
			System.out.println(v.getKey());
			System.out.println(v.getValue().getCustomerID());
			System.out.println(v.getValue().getCustomerName());
			
		}
		
	}

	
	
	
}
