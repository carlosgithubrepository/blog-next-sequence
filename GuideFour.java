package main;

public class GuideFour {
	public static void main(String[] args) {
		String firstName = "Carlos";
		String lastName = "Eduardo";
		Integer age = 35;
  	    Boolean validate;
		validate = firstName.equals(lastName) ;
		System.out.println(" validation = " + validate);
  	    validate = age.equals(ExempleFour.returnedPrint());
  	    System.out.println(" validation = " + validate +" number of hash: "+ validate.hashCode());
	}	
}
class ExempleFour{
	static Integer returnedPrint() {
		int age = 35;
	 return age;		
	}
}