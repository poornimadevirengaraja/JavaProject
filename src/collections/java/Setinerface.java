package collections.java;
/*
 * Set ?  
 * 1)Set is an Interface under the collection Interface.
 * 2) It stores the value in unordered collections.
 * 3) It does not allow duplicate elements
 * 4) It is not an index basis and cannot access values using index
 * 5) Null elements can be stored only once
 * 6) It comes from java.util package
 * 
 * 3 Types
 * *******
 * 1) Hashset - It stores the value in random order
 * 2) LinkedHashset - It stores the value in insertion order
 * 3) Treeset - It stores the values in sorted order
 * 
 * set methods will not include methods that uses to access value using index basis as you seen in the list which includes methods using index basis like :
 * Methods that are not available in set
**************************************
add(int index, integer element)
get(int index)
indexOf(Object O)
set
subList 
etc
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setinerface{
	
	public static void main(String[] args) {
		// 1) Hashset - random order
		System.out.println("**1**");
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		System.out.println(s);
		
		//2) Linkedset - Insertion order
		System.out.println("**2**");
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(10);
		s1.add(700);
		s1.add(60);
		s1.add(100);
		s1.add(50);
		System.out.println(s1);
		
		//2) Linkedset - Insertion order
		System.out.println("**3**");
		Set<Object> s5=new LinkedHashSet<>();
		s5.add("zoo");
		s5.add("Ball");
		s5.add(12.78);
		s5.add(2000);
		s5.add("Apple");
		for ( Object lhs:s5) {
			System.out.println(lhs);
		}
		
		//3) Treeset - sorted order
		System.out.println("**4**");
		Set<Integer> s3=new TreeSet<>();
		s3.add(10);
		s3.add(700);
		s3.add(60);
		s3.add(100);
		s3.add(50);
		for ( Integer ts:s3) {
			System.out.println(ts);
		}
		
		//3) Treeset - sorted order
		System.out.println("**5**");
		Set<String> s4=new TreeSet<>();
		s4.add("zoo");
		s4.add("Ball");
		s4.add("Home");
		s4.add("Home");
		s4.add("Apple");
		for ( String ts2:s4) {
			System.out.println(ts2);
		}		
		/* 
		 *  If we are depending on the default natural sorting order, 
		 *  the objects that are being inserted into the tree should be homogeneous and comparable.
		 *  TreeSet does not allow the insertion of heterogeneous objects.
		 *  It will throw a classCastException at Runtime if we try to add heterogeneous objects.
		 *  The TreeSet can only accept generic types which are comparable.
		 *	For example, the StringBuffer class implements the Comparable interface.
		 */		
		//3) Treeset - sorted order
		System.out.println("**6**");
//		// This will throw class cast exception as it has heterogeneous elements in Object
//		Set<Object> s7=new TreeSet<>();
//		s7.add("zoo");
//		s7.add("Ball");		
//		s7.add(12.67f);
//		s7.add(5000);
//		s7.add("Apple");
//		System.out.println(s7);
		
		//3) Treeset - sorted order
		System.out.println("**7**");
//		// This will throw class cast exception as it has heterogeneous elements in Object
//		Set<StringBuffer> s7=new TreeSet<>();
//		s7.add(new StringBuffer("zoo"));
//		s7.add(new StringBuffer("zoo"));	
//		s7.add(new StringBuffer("Apple"));
//		s7.add(new StringBuffer(1000));
//		s7.add(new StringBuffer(15));
//		System.out.println(s7); // prints only string values in sorted way
		
		
		//3) Treeset - sorted order
		System.out.println("**8**");
//		// This will throw class cast exception as it has heterogeneous elements in Object
		Set<Object> s8=new TreeSet<>();
		s8.add(1);
		s8.add(456);		
		s8.add(1678);
		s8.add(2);
		s8.add(45);
		System.out.println(s8);		
	}
}


