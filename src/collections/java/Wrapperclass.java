package collections.java;
/* 
 * Wrapper class? It converts primitive data types to an objects. It is called boxing.
 * Primitive Data Type	Wrapper Class:
 * ***********************************
byte	Byte
short	Short
int		Integer
long	Long
float	Float
double	Double
boolean	Boolean
char	Character

syntax:
**********
Wrapper_class obj_name=value;
*/

public class Wrapperclass {

	public static void main(String[] args) {
		Integer myint = 10; // wrapper object myint is created here using Integer wrapper class.Boxes int to
							// an Integer object
		Double mydouble = 12.45; // wrapper object mydouble is created here using Integer wrapper class.Boxes
									// double to an Double object
		Float myfloat = 1232.56f;
		Long mylong = 1235465l;
		Boolean myboolean = true;
		Character chr = 'A';
		Short shrt = 12334;
		byte byt = 45;

		myint = myint + 20; // Here unboxes the Integer to a int

		System.out.println(myint);
		System.out.println(mydouble);
		System.out.println(myfloat);
		System.out.println(myboolean);
		System.out.println(chr);
		System.out.println(shrt);
		System.out.println(byt);

	}
		
}
