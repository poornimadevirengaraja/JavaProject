package polymorphism;

import oopsconcepts.classesandobjects;

//ctrl + / - to block the whole set of lines

//polymorphism - the ability of object to make many forms
// 2 methods - method overloading ( compile time polymorphism - called overloading a static method in java) 
// & method overriding ( this is called run time polymorphism)


//method overloading 
// same method name with different parameters
// depending on the input parameter 1,2,3  given by user that method will be called 
//Suppose you have to perform addition of the given numbers but there can be any number of arguments, 
//if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters 
//then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.

// 2types 
// same name with different arguments
// same name with different data types
//takes place in same class//

// Rules // - overloading will not happen for final
// called complile time polymorphism
// May or may not require inheritance
//takes place in same class//
// final and static methods can be overloaded but cannot be overrided in java


public class overloadingmethods {

//	Method overloading Example : without arguments 
	public  void Addition()
	{
		System.out.println("Addition without Parameters");
	}
	public  void Addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public  void Addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public  void Addition(int a,int b,int c , int d)
	{
		System.out.println(a+b+c+d);
	}
	// same name with different data types	
	public  void Addition(int a, double b,double c) {  
		System.out.println(a+b+c);
	}
	
	
	
}
