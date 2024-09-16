package datatypes;
/*
 * datatype : ? how memory stores the value of the variables
 * 2 types : ? Primitive and Non-Primitive data types
 * Primitive Data types : ( 8 Primitive types)
 * ============================================
1) boolean - boolean 
2) character - char - single character or single letter or ASCII character
3) int - Long,int,short,byte
4) float - double, float

 * 
 */
public class primitivedatatype {
	
	public static void main(String[] args) {
		
		//true or false
		boolean bln=true;
		System.out.println((bln));
		
		//char
		char var1='A';
		char var2='B';
		System.out.println(var1);
		System.out.println(var2);
		
		/*Long
		 * long is a 64-bit. ends with L or l
		 */
		 long lng=1234567891012L;
		 System.out.println(lng);
		 
		 /*int
		  * Int is 32-bit. default value is 0.
		  */
		 int i=1234;
		 System.out.println(i);
		 /*byte
		  * smallest data type of whole numbers ranging from -128 to 127.
		  */
		 byte by=127;
		 System.out.println(by);
		 
		 /*short
		  * Short is a 16-bit. default value is 0.
		  */
		 short sh=1236;
		 System.out.println(sh);
		 
		 /*
		  * float - It is a floating-point data type that stores the values, including their decimal precision.
		  * single-precision 32-bit, 
		  * ends with f or F, 
		  * decimal point precision is 7 digits
		  *  
		  */
		 float fl=124454354354545F;
		 System.out.println(fl);
		 
		 /*double - It is a double-precision 64-bit 
		  * 15-digit decimal point precision
		  * ends with D or d
		  * */
		 double dl=123343434.1234567891011123d;
		 System.out.println(dl);
		 
	}

}
