package Exceptions;

import java.io.IOException;

public class throwandthrows {
	
	public void m1() throws IOException { //throws  exception
		throw new IOException("device error");// throw exception - You are wantedly creating an exception here
	}
	
public static void main(String[] args) throws IOException { //throws exception - shows exception may occur
	throwandthrows tt=new throwandthrows();
	// exception is handled here using try catch and hence normal flow starts after exception is  handled
	try{
		tt.m1();
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	System.out.println("normal flow...starts here again");  
	
}
}
