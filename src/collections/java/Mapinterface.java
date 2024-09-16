package collections.java;

import java.util.*;
import java.util.Map.Entry;

/*Map? It is an interface.
 * 1) A map contains values on the basis of key, i.e. key and value pair. 
 * 2) Each key and value pair is known as an entry. 
 * 3) A Map contains unique keys.
 * 4) A Map doesn't allow duplicate keys, but you can have duplicate values. 
 * 5) HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
 * 6) A Map is useful if you have to search, update or delete elements on the basis of a key.
 * 7) Set is mutable - HashSet, TreeSet, and LinkedHashSet. These are mutable sets and they use different rules for ordering elements and have some additional methods.
 * 3 types:
 * ********
	HasMap - Random Order
	Linked HasMap - Insertion Order
	Tree Map - Ascending Order 
 */
public class Mapinterface {

	public static void main(String[] args) {
		System.out.println("*********Ex -1*********");
		// Map - Key and Values - keyset() and values()
		Map<Integer, String> map = new HashMap<Integer, String>();
		// Adding elements to map
		map.put(1, "Zahra");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		System.out.println(map.keySet());
		// values
		Collection<String> s = map.values();
		System.out.println(s);
		// or
		System.out.println(map.values());

		// Entry set
		/*
		 * 1) It is a subinterface of Map 2) It returns the collection view of the Map
		 * 3) keyvalue() and getvalue() is used to get key and value in map
		 */

		System.out.println("*********Ex -2*********");
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Apple");
		map1.put(5, "jack");
		map1.put(2, "Orange");
		map1.put(6, "Banana");
		System.out.println(map1.entrySet()); // Returns a Set view of the mappings contained in this map
		// entry set creation
		// entryset() returns set of Entry<Integer, String>
		Set<Entry<Integer, String>> set1 = map1.entrySet();
		for (Entry<Integer, String> a : set1) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
		}

		// get method gets the value of the key
		System.out.println(map1.get(2)); // starts from 0 here Orange printed

		System.out.println("*********Ex -3*********");
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Apple");
		map2.put(5, "jack");
		map2.put(2, "Orange");
		map2.put(6, "Banana");

		// entry set creation
		Set<Entry<Integer, String>> set2 = map2.entrySet();
		// Iterator method to loop through the Map
		Iterator<Entry<Integer, String>> itr = set2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getKey());
			System.out.println(itr.next().getValue());
		}
		
		
		System.out.println("*********Ex - 4*********");
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		
		
		System.out.println("*********Ex -5*********");
		capitalCities.remove("England");
		System.out.println(capitalCities);
		
		
		System.out.println("*********Ex -6*********");
		System.out.println("size : "+capitalCities.size());
		
		
		
		System.out.println("*********Ex -7*********");
		capitalCities.clear();	
		System.out.println(capitalCities);
		
		
		
		System.out.println("*********Ex -8*********");
		HashMap<Object, Integer> abc = new HashMap<Object, Integer>();
		abc.put(12, 1);
		abc.put("j", 1);
		abc.put("Apple", 1000);
		System.out.println(abc.keySet());
		System.out.println(abc.values());		
		Set<Entry<Object, Integer>> mptry = abc.entrySet();
		System.out.println(mptry); // prints the entryset view or map collection set view		
		for(Entry<Object, Integer> b:mptry) {
			System.out.println(b.getKey()+" "+b.getValue());			
		}
		
		System.out.println("*********Ex -9*********");
		Map<String, String> asiaCapital1 = new HashMap<String, String>();
	    asiaCapital1.put("Japan", "Tokyo");
	    asiaCapital1.put("South Korea", "Seoul");

	    Map<String, String> asiaCapital2 = new HashMap<String, String>();
	    asiaCapital2.put("South Korea", "Seoul");
	    asiaCapital2.put("Japan", "Tokyo");

	    Map<String, String> asiaCapital3 = new HashMap<String, String>();
	    asiaCapital3.put("Japan", "Tokyo");
	    asiaCapital3.put("China", "Beijing");

	    System.out.println(asiaCapital1.equals(asiaCapital2));
	    System.out.println(asiaCapital1.equals(asiaCapital3));
	    	    
	    System.out.println("*********Ex -10*********");	 	    
	    //replace element	
	    asiaCapital3.replace("Japan","Tomakra");
	    System.out.println(asiaCapital3.entrySet());
	    
	    
	    System.out.println("*********Ex -11*********");
	    //remove element
	    asiaCapital3.remove("Japan");
	    System.out.println(asiaCapital3.entrySet());
	}

}