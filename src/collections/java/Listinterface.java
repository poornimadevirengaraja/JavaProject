package collections.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
 * collections? It is a framework which allows the programmer to use the pre-packaged data structure as well as algorithm for manipulating them.
 * Framework? 
 * It provides ready made architecture.
 * It represents a set of classes and interfaces.
 * Collections
 * ***********
 * 1) List 2) Set 3) Map 
 * List, Set, Map are called Interface.
 * 
 * 1) List - Arraylist, Linkedlist( Doubly linked list ),Vectorlist
 * 2) Set - Hashset,Linkedhashset,Treeset
 * 3) Map - Hashmap,LinkedhashMap,Treemap
 * 
 * Arraylist, Hashset, Hashmap etc are called Interfaces or classes
 * 
 * Arraylist is used to search the value faster than linked list
 * Linkedlist is used to add and delete the values faster than Arraylist
 * 
 * 1) List: 
 * ********
 * 1) List stores the data in an insertion order or Linear order
 * 2) It is mutable - You can change the elements in the list by add,remove etc
 * 3) List allows duplicates
 * 4) List works on index basis
 * 5) Important understand : Mostly List Interface( Interface means object can't be created) so it is implemented using ArrayList class( class means object can be created). 
 * 	  ArrayList is dynamic sized array. It can grow or shrink as needed.
 * 6) It comes from java.util package
 */
public class Listinterface { 
	
	public static void main(String[] args) {
		/* add */
		System.out.println("**1**");
		List<Integer> myint=new ArrayList<>();
		myint.add(10);
		myint.add(20);
		myint.add(30);
		System.out.println(myint);
		// Outputs for list will be obtained inside square brackets
		
		/* add*/
		System.out.println("**2**");
		List<String> mystring=new ArrayList<>();
		mystring.add("Poornima ");
		mystring.add("Devi ");
		mystring.add("Rengaraja");
		System.out.println(mystring);
		
		
		/* Add two lists of same data type */
		System.out.println("**3**");
		List<Integer> myint1=new ArrayList<>();
		myint1.add(10);
		myint1.add(20);
		myint1.add(30);		
		List<Integer> myint2=new ArrayList<>();
		myint2.add(40);
		myint2.add(50);		
		myint1.addAll(myint2); // addall adds two collection lists
		System.out.println(myint1);		
		//size of a list
		System.out.println("size of list is :"+myint1.size());		
		//get method 
		System.out.println(myint1.get(3)); // it will give the index 3 value in the list
		//clear values in the list
		myint1.clear();
		System.out.println(myint1);	
		
		
		/* Retain from two lists ( common ) 
		 * retainAll() method of ArrayList retains only the elements in the ArrayList that are common to another specified collection.
		 * */
		System.out.println("**4**");
		List<Integer> myint3=new ArrayList<>();
		myint3.add(100);
		myint3.add(200);
		myint3.add(300);
		System.out.println(myint3);
		
		List<Integer> myint4=new ArrayList<>();
		myint4.add(100);
		myint4.add(500);
		System.out.println(myint4);
		
		myint3.retainAll(myint4); // retainAll adds two collection lists
		System.out.println(myint3);
		
		//get integer value using for loop - get method
		System.out.println("**5**");
		List<Integer> myint5=new ArrayList<>();
		myint5.add(10);
		myint5.add(20);
		myint5.add(30);
		for( int i=0;i < myint5.size();i++) {
			System.out.println(myint5.get(i));
		}
		
		//get String value using for loop - get method
		System.out.println("**6**");
		List<String> myint6=new ArrayList<>();
		myint6.add("The");
		myint6.add("Moon");
		myint6.add("Shines");
		for( String s: myint6) {
			System.out.println(s);
		}
		
		//Check the value in the list 
		System.out.println("**7**");
		List<Integer> myint7=new ArrayList<>();
		myint7.add(100);
		myint7.add(20);
		myint7.add(30);
		for( int i=0;i < myint7.size();i++) {
			if(myint7.get(i)==100) {
				System.out.println(" value in the List is equal to 100");
			}else {
				System.out.println(" value in the List is not equal to 100 ");
			}
			//System.out.println(myint7.get(i));
		}
		
		//Point to index value
		System.out.println("**8**");
		List<Integer> myint8=new ArrayList<>();
		myint8.add(10);
		myint8.add(20);
		myint8.add(30);
		myint8.add(40);
		myint8.add(50);
		myint8.add(60);
		System.out.println(myint8.indexOf(30)); // It gives the index number of the value
		//Remove method
		myint8.remove(2);
		System.out.println(myint8);// removes the index 2  value from the list
		
		//Add a value using index 
		System.out.println("**9**");
		List<Integer> myint9=new ArrayList<>();
		myint9.add(10);	
		myint9.add(30);
		myint9.add(40);
		myint9.add(50);
		myint9.add(60);
		System.out.println(myint9);
		myint9.add(1, 20);
		System.out.println(myint9); // 20 value will get added in index 1 place
		
		//set a value using index ( replace the existing value)
		System.out.println("**10**");
		List<Integer> myint10=new ArrayList<>();
		myint10.add(10);	
		myint10.add(10);
		myint10.add(30);
		myint10.add(40);
		myint10.add(50);
		System.out.println(myint10);
		myint10.set(1, 20);
		System.out.println(myint10); // 10 value will set replaced as 20 in index 1 place
		
		//sublist - extract values between index's given
		System.out.println("**11**");
		List<Integer> myint11=new ArrayList<>();
		myint11.add(10);	
		myint11.add(20);
		myint11.add(30);
		myint11.add(40);
		myint11.add(50);
		myint11.add(60);
		myint11.add(70);
		System.out.println(myint11);
		
		List<Integer>myint12 = myint11.subList(2, 4); // starts from index n =2 index is 30 and ends n-1( 4-1= 3 index)is 40
		System.out.println(myint12);
		
		//object - it includes all datatypes
		System.out.println("**12**");
		List<Object> myint13=new ArrayList<>();
		myint13.add(10);	
		myint13.add(20.456);
		myint13.add("Devi");
		myint13.add('A');
		myint13.add(true);
		myint13.add(123.56f);
		myint13.add(123.5634d);
		System.out.println(myint13);
		
		//Last index and first index - if same value is duplicated in list 
		System.out.println("**13**");
		List<Object> myint14=new ArrayList<>();
		myint14.add(10);	
		myint14.add(20);
		myint14.add(30);
		myint14.add(40);
		myint14.add(50);
		myint14.add(60);
		myint14.add(30);		
		System.out.println(myint14.lastIndexOf(30)); // 30 is in 2 index and 6 index.  last index is 6 printed here
		
		
		/*
		 *difference  List	& ArrayList
			1) List is an interface	| ArrayList is a class
			2) List interface extends the Collection framework |	ArrayList extends AbstractList class and implementsList interface
			3) List cannot be instantiated. | ArrayList can be instantiated.
		 */
		
		
	}
	
}
