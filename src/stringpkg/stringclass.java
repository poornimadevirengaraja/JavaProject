package stringpkg;

/*
 * String is a non-primitive data type
 * String enclosed with double quotes
 * String works on index basis
 * It starts with  0 and ends with n-1
 * String is a class
 * java.lang package
 * String is immutable - value cannot be changed
 * String memory - SCP - string constant pool
 */

public class stringclass {
	
	public static void main(String[] args) {
		
		/* String literal */
		//The type of string called as literal string or string literal
		//When you declare string within the double quotes it is string literal
		//String literal is faster than String Object
		//String is immutable - value cannot be changed
		//String memory - SCP - string constant pool		
		String a = "Fita";
		String b = "Fita"; 
		
		//Here string a and string b will point to the same "Fita" as the value cannot be change	
		/*	String Object
		 *  string object - heap memory	
		 *  string object is slower compared to string literal	
		 */
		String c=new String("Fita");
		String d=new String("Fita");
		
		/* Garbage collector
		*******************
		*It will clear unused value from memory automatically
		
		*String Methods
		***************
		*To Lower case to Upper Case
		*/
		String s="java";
		String upcase=s.toUpperCase();
		System.out.println(upcase);

		/*To Upper Case to Lower case*/
		String x="APPLE";
		String lcase=x.toLowerCase();
		System.out.println(lcase);
		
		/* Print character using its index value*/
		String y="poornima";
		char ch=y.charAt(4); // string starts with index 0
		System.out.println(ch);
		
		/* concat 2 strings*/
		String z ="Good";
		String e =z.concat(" morning");
		System.out.println(e);
		
		/*contains some string*/
		String f = "Array";
		boolean g = f.contains("r");
		System.out.println(g);
		
		/*ends with some string*/
		String h="Ganges";
		boolean i= h.endsWith("es");
		System.out.println(i);
		
		/*Compare*/
		String j = "ARRAY";
		String k = "array";
		boolean j1 = j.equals(k);
		System.out.println(j1);
		
		/*Ignore case sensitive*/
		String j2 = "ARRAY";
		String k2 = "array";
		boolean j3=k2.equalsIgnoreCase(j2);
		System.out.println(j3);
		
		/* indexof method*/
		String L1 = "Array";
		int L2 = L1.indexOf("a");
		System.out.println(L2);

		/*Length*/
		String s1 = "Array";
		int leng = s1.length(); // It will give the human readable number 
		System.out.println(leng); // It will not print the index number
		
		/*isempty*/
		String p1 = " ";
		boolean e1 = p1.isEmpty();
		System.out.println(e1);
		
		/* Replace word or char in string */		
		String a1 = "Array is Java";
		String b1 = a1.replace("Array", "Topic");
		System.out.println(b1);
		
		/* Substring in java*/
		String b2="Happy Home";
		String c1 = b2.substring(3, 6);// string start index 0 here 3 , ends index n-1 here 6-1 = 5
		System.out.println(c1);
		
		/*trim removes space in edge*/
		String d1 = "  Array is Java  ";
		String e2 = d1.trim();
		System.out.println(e2);
		
		/*Char array converts string to each char array*/
		String f1 = "Array is Java";
		char[] c4=f1.toCharArray();
		for(int i1=0;i1<c4.length;i1++) {
			System.out.println(c4[i1]);
		}
		
		/*split the array*/		
		/*public String[] split(String regex, int limit)*/
		String h1 = " Array is Java, string is java ";
		String[] h2= h1.split(" ");
		for(String val: h2)
		System.out.println(val);
		
		
	}


	
	

}
