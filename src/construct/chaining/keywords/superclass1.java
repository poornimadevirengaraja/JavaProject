package construct.chaining.keywords;

public class superclass1 {
	
	 public  superclass1() {
		    System.out.println("Parent class");
		  }
	
	 public  superclass1(int a) {
		    System.out.println("Parent class: "+a);
		  }
	 
	 public  superclass1(int a,String b) {
		    System.out.println("Parent class :"+a+" "+b);
		  }

	public static void main(String[] args) {
		superclass1 s=new superclass1();
		superclass1 s1=new superclass1(1200);
		superclass1 s2=new superclass1(100,"Duty");
	}



}
