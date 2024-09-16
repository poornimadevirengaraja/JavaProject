package stringpkg;
public class stringbufferstringreader {
	public static void main(String[] args) {
		/* String Buffer 
		 * Its a legacy method of Java was introduced in 1.0.
		 * Its a thread safe. 
		 * Performance is low		
		 */				
		/*String Reader
		***************
		*Its not a legacy method of Java was introduced in 1.5.
		*Its not a thread safe. 
		*performance is good
		*/		
		/* Both are mutable string - You can change the value */
		/*Append*/
		StringBuffer a =new StringBuffer("s");
		StringBuffer b =a.append("trong");
		System.out.println(b);
		
		/*Delete charat the index */
		StringBuffer a1 =new StringBuffer("sample blood");
		StringBuffer b1 =a1.deleteCharAt(5);
		System.out.println(b1);
		
		/*Delete*/
		StringBuffer c = new StringBuffer("Fitaacadamy");
		StringBuffer d = c.delete(1,4);// index starts from 0 ends with n-1 here 3-1=2 
		System.out.println(d);
		
		/* Reverse*/
		StringBuffer c1 = new StringBuffer("Fita is bad");
		StringBuffer d1 = c1.reverse();
		System.out.println(d1);
		
		/* Replace */
		// here 'pio' 4 to 7-1=6 index will be replaced with Poornimadevi
		StringBuffer e=new StringBuffer("Champions");
		StringBuffer f=e.replace(4, 7, "poornimadevi"); 
		System.out.println(f);
		
		/* insert */
		StringBuffer g = new StringBuffer("Fita");
		StringBuffer h = g.insert(2, "ABC");
		System.out.println(h);
		}
}
