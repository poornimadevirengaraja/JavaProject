package collections.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceMethods {
	public static void main(String[] args) {
		/*
		 * In set, 
		 * addAll() method is used to perform the union, 
		 * retainAll() method is used to perform the intersection and 
		 * removeAll() method is used to perform difference.
		 */
		//addAll - Union
		System.out.println("**1**");
		Set<Integer> s1=new TreeSet<>();
		s1.add(10);
		s1.add(700);
		s1.add(60);
		s1.add(100);
		s1.add(50);
		System.out.println(s1);
		Set<Integer> s2=new TreeSet<>();
		s2.add(100);
		s2.add(200);
		s2.add(500);
		s2.add(700);
		s2.add(800);
		System.out.println(s2);
		s1.addAll(s2); // Union		
		System.out.println(s1);
		
		//retainAll - Intersection 
		System.out.println("**2**");
		Set<Integer> s3=new TreeSet<>();
		s3.add(10);
		s3.add(700);
		s3.add(60);
		s3.add(100);
		s3.add(50);
		System.out.println(s3);
		Set<Integer> s4=new TreeSet<>();
		s4.add(100);
		s4.add(200);
		s4.add(500);
		s4.add(700);
		s4.add(800);
		System.out.println(s4);
		s3.retainAll(s4); // Intersection
		System.out.println(s3);
		
		//removeAll - difference ( deletes the values occurring in other set)
		System.out.println("**3**");
		Set<Integer> s5=new TreeSet<>();
		s5.add(10);
		s5.add(700);
		s5.add(60);
		s5.add(100);
		s5.add(50);
		System.out.println(s5);
		Set<Integer> s6=new TreeSet<>();
		s6.add(100);
		s6.add(200);
		s6.add(500);
		s6.add(700);
		s6.add(800);
		System.out.println(s6);
		s5.removeAll(s6); // difference
		System.out.println(s5);
		
		//removeAll - difference ( deletes the values occurring in other set)
		System.out.println("**4**");
		Set<String> s7=new TreeSet<>();
		s7.add("Hi");
		s7.add("Poornima");
		s7.add("Morning");			
		System.out.println(s7);
		Set<String> s8=new TreeSet<>();
		s8.add("Hi");
		s8.add("Poornima");
		s8.add("Afternoon");			
		System.out.println(s8);
		s7.removeAll(s8); // difference ( deletes the values occurring in other set)
		System.out.println(s7);
		
		//removeAll - difference ( deletes the values occurring in other set)
		System.out.println("**5**");
		Set<Object> s9=new TreeSet<>();
		s9.add("Hi");
		//s9.add(1); // This will throw classcastexception
		s9.add("Poornima"); // so use same homogeneous datatypes for Objects in Tree
		s9.add("Morning");			
		System.out.println(s7);
		Set<String> s10=new TreeSet<>();
		s10.add("Hi");
		s10.add("Poornima");
		s10.add("Afternoon");			
		System.out.println(s10);
		s9.removeAll(s10); // difference ( deletes the values occurring in other set)
		System.out.println(s9);
		
		//clear - The method removes all the elements from the set. It doesn't delete the reference of the set. It only deletes the elements of the set.
		System.out.println("**6**");
		Set<Integer> s11=new TreeSet<>();
		s11.add(10);
		s11.add(700);
		s11.add(60);
		s11.add(100);
		s11.add(50);
		s11.clear();
		System.out.println(s11);
		
		//contains - the contains() method is used to know the presence of an element in the set. Its return value is true or false.
		System.out.println("**7**");
        Set<Object> data = new LinkedHashSet<>();   
        data.add(31);   
        data.add(21);   
        data.add("Good");   
        data.add(51);   
        data.add(11);   
        data.add("Feeble");   
        System.out.println("Set: " + data);  
        System.out.println("Does the Set contains '91'?" + data.contains(91));   
        System.out.println("Does the Set contains 'javaTpoint'? " + data.contains("Good"));  
        System.out.println("Does the Set contains '51'? " + data.contains(51));  
		
        //containsAll -  The method is used to check whether all the elements of the collection are available in the existing set or not.
    	System.out.println("**8**");
		Set<Integer> s12=new HashSet<>();
		s12.add(10);
		s12.add(700);
		s12.add(60);
		s12.add(100);
		s12.add(50);
		System.out.println(s12);
		System.out.println("Size of this set s12 is :"+s12.size()); // Prints the size of the set
		Set<Integer> s13=new TreeSet<>();
		s13.add(10);
		s13.add(50);
		s13.add(60);
		s13.add(700);
		s13.add(1000);
		System.out.println(s13);
		System.out.println(s12.containsAll(s13)); 
		System.out.println(s12);
		System.out.println(s12.hashCode()); // Prints s12 hashcode
		
		// remove - It will remove a particular element from the set
		System.out.println("*9**");
		s12.remove(700);
		System.out.println(s12);
		
		//isEmpty - It will check whether the set is empty and return boolean result
		System.out.println(s12.isEmpty());
		s12.clear();
		System.out.println(s12.isEmpty());
		
	}

}
