package oops.polymorphism.overloading;
/*
 * polymorphism -? means single action in many forms. It occurs when many classes are related to each other using inheritance
 * Types of polymorphism : 
 * ========================
 * 1) compile time polymorphism or static polymorphism or method overloading
 * 2) run time polymorphism or dynamic polymorphism  or method overriding
 * 
 * compile time polymorphism or static polymorphism or method overloading ?
 * ==========================================================================
 * 1) multiple methods having same method name but different parameters
 * 2) parameter changes in number of arguments
 * 3) parameter changes in data types of arguments
 * 4) return type may or may not be same
 * 5)*** important***? Method overloading takes place in the same class (Note: this includes any methods inherited, even implicitly, from a superclass). 
 * 6) static and final methods can be overloaded */

public class multiplication {
	
	static int multiply( int a , int b) { // by Using Different Numbers of Arguments
		return a*b;
	}
	static int multiply( int a , int b, int c) { // by Using Different Numbers of Arguments
			return a*b*c;		
	}
	static double multiply( double a , double b) { // by Using Different data type of Arguments
		return a*b;
	}
	
	static double multiply( float a , float b,float c) { // by Using Different data type of Arguments
		return a*b*c;
	}
	static String multiply( String a ) { // by Using Different data type of Arguments and number of Arguments
		return a;
	}
	
	
}
