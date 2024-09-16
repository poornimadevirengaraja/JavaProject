package collections.java;

import java.util.LinkedList;

/* Linked List ?
 * **************
 * The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
 * The LinkedList stores its items in "containers"
 * Java LinkedList class uses a "doubly linked list" to store the elements 
 * The list has a link to the first container and each container has a link to the next container in the list. 
 * To add an element to the list, the element is placed into a new container and that container is linked to one of the other containers in the list.

 *But the LinkedList provides several methods to do certain operations more efficiently :
 ******************************************************************************************
addFirst()	Adds an item to the beginning of the list	
addLast()	Add an item to the end of the list	
removeFirst()	Remove an item from the beginning of the list	
removeLast()	Remove an item from the end of the list	
getFirst()	Get the item at the beginning of the list	
getLast()	Get the item at the end of the list
 * 
 * */
public class CollectionsLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
	      ll.add("Ravi");  
          ll.add("Vijay");  
          ll.add("Ajay");  
          System.out.println(ll);      
                  
          //Adding an element at the specific position  
          ll.add(1, "Gaurav");  
          System.out.println(ll);  
          
          LinkedList<String> ll2=new LinkedList<String>();  
          ll2.add("Sonoo");  
          ll2.add("Hanumat");  
          
          //Adding second list elements to the first list  
          ll.addAll(ll2);  
          System.out.println(ll);  
          
          
          LinkedList<String> ll3=new LinkedList<String>();  
          ll3.add("John");  
          ll3.add("Rahul");  
          //Adding second list elements to the first list at specific position  
          ll.addAll(1, ll3);   // adding in index 1 all the ll3 elements
          System.out.println(ll);
          
          
          //Adding an element at the first position  
          ll.addFirst("Lokesh");  
          System.out.println("After invoking addFirst(E e) method: "+ll);  
          
          //Adding an element at the last position  
          ll.addLast("Harsh");  
          System.out.println("After invoking addLast(E e) method: "+ll);  

          //Object add first and add last
        LinkedList<Object> myint15=new LinkedList<>();
  		myint15.add("devi");
  		myint15.addFirst(1);
  		System.out.println(myint15);  		
  		myint15.addLast("renga");
  		System.out.println(myint15);
	}

}
