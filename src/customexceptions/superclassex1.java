package customexceptions;
/* 
 * custom exceptions ?
 * user defined exceptions which u can create by your own
 */
public class superclassex1 extends Exception{

//	@Override
	public String getMessage() { // Added from source > overridden methods >getMessage()
		// TODO Auto-generated method stub
		return "THis is a custom exception message";
	}
	
	
//	public String getmessage() {	// Normal method will not work 	
//		return "Custom exception";
//	}
	
	
//	superclassex1(String s){ // Constructor will work		
//		System.out.println(s);
//	}
	

}
