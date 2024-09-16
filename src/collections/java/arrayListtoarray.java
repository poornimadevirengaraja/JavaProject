package collections.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayListtoarray {
	public static void main(String[] args) {
		// List to array
		System.out.println("**1**");
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(400);
		list1.add(30);

		Object[] arry = list1.toArray();
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}

		// set to array
		System.out.println("**2**");
		Set<Integer> set1 = new HashSet<>();
		set1.add(100);
		set1.add(400);
		set1.add(30);
		Object[] arry1 = set1.toArray();
		for (int j = 0; j < arry1.length; j++) {
			System.out.println(arry[j]);
		}

		// set to array
		System.out.println("**3**");
		Set<String> set2 = new HashSet<>();
		set2.add("good");
		set2.add("day");
		set2.add("Devi");
		System.out.println(set2); // set prints as output
		Object[] ar1=set2.toArray();
		for(Object obj:ar1) {
			System.out.println(obj); // array prints as output
		}
		
		
		}



}
