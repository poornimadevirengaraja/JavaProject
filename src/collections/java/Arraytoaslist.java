package collections.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// convert an Array to List or Array to ArrayList
// convert an Array to Set or Array to Hashset - 1st convert to List and 2nd convert to Set
// Arrays.asList(array);

public class Arraytoaslist {
	public static void main(String[] args) {
		System.out.println("**********Ex:1-Array**********");
		Integer[] ar = { 10, 20, 30, 40 }; // array given like this in flower bracket
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("***convering Array to List******");
		List<Integer> list1 = Arrays.asList(ar);
		System.out.println(list1); // only for array for loop to get elements. List or set just do like this to get elements.
	

		System.out.println("**********Ex:2-Array**********");
		String[] array = { "z", "b", "f" };
		for(String s:array) {
			System.out.println(s);
		}
		System.out.println("***convering Array to set******");
		List<String> List2 = Arrays.asList(array); // first convert Array into list
		System.out.println("List: " + List2);
		Set<String> set2 = new HashSet<>(List2); // Second convert list to set		
		System.out.println("Set: " + set2);
		
	}


}
