package scannerpkg;
import java.util.Scanner;
/*Scanner:
==========
1) It can get the input from the user during the run time
2) scanner class is present in package java.util
3) It cannot extends
4) It can be used in main methods*/

/*Scanner methods
*****************
1. nextInt();
2. nextByte();
3. nextShort();
4. nextlong();
5. nextfloat();
6. nextdouble();
7. nextBoolean();
8. next();
9. nextLine();*/

/*syntax:
=======
Scanner refName=new Scanner(system.in);
refName.scannermethods();*/

public class scannerclass {
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);	
		System.out.println("Enter the value here :");
	    //int a=x.nextInt();
		//String a=x.next(); // next() will extract first part of string before space
		//String a=x.nextLine(); // nextLine() will extract the whole value
		//boolean a=x.nextBoolean();// only true or false 
		//short a=x.nextShort();
		//long a=x.nextLong();
		//float a=x.nextFloat();
		double a=x.nextDouble();
	    System.out.println("The value is :"+a);
	    x.close();
	}
}
