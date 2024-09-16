package Encapsulation;

public class totesttheencapsulatedclass {
	public static void main(String[] args) {
		
		 //creating instance of fullyencapsulatedclass class  
		fullyencapsulatedclass fec=new fullyencapsulatedclass();
		
		//setting values through setter methods  
		fec.setAccountno(23004500670089L);		
		fec.setName("Poornima");
		fec.setEmail("r.poornimadevi29@gmail.com");
		fec.setAmount(140000);
		
		
		 //getting values through getter methods  
		System.out.println(fec.getAccountno());
		System.out.println(fec.getName());
		System.out.println(fec.getEmail());
		System.out.println(fec.getAmount());
		
	}

}
