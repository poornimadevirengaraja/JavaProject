package datatypes;

/*
 * Non primitive datatpe : ? 
 * ======================
 * Refers to instances or objects 
 * it doesn't store the values of variables directly but it stores as memory address of variable.
 * user-defined data types
 * all non primitive data types are equal in size * 
 * Types:
 * =====
 * 1) Array
 * 2) class
 * 3) Interfaces
 * 4) String
 * 5) Enum
 */
public class nonprimitivedatatpe {

	public static void main(String[] args) {
		/*
		 * Array - It holds elements of the same data type It is an Object in java Array
		 * name is the address for the elements in array
		 */
		
		int[] Array_name=new int[5];
		Array_name[0]=4454;
		Array_name[1]=4543;
		Array_name[2]=1223;
		Array_name[3]=1000;
		Array_name[4]=900;
		
		System.out.println(Array_name[3]);
		
		// string
	    String S1 = "Java String Data type";
	 
	    System.out.println(S1);   
	    
	    //class  - u learned already
	    //interface - u learned already		
	}
}
