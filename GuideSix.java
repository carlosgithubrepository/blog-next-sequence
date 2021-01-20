package main;

public class GuideSix {

	public static void main(String[] args) {
		ExempleSix.view();
	}

}
class ExempleSix{
	static void view() {
		String[] emails = new String[3];
	    emails[0] = "carlos.developer.job@outlook.com";
		emails[1] = "carlos.developer.job@GmAiL.com"; 
		emails[2] = "carlos%4   342eduard  o1234#   brasil  @GmAiL.com#$  $@ahahaha   ";
	    // ok, find all gmail emails for me?
		System.out.println(emails[1].toString().toLowerCase().endsWith("@gmail.com")+ ": " + emails[1].toLowerCase());
		System.out.println(emails[1].toString().endsWith("@gmail.com")+ ": " + emails[1].toLowerCase()+ " - false? why?");
		System.out.println(emails[0].toString().toLowerCase().endsWith("@gmail.com")+ ": " + emails[0].toLowerCase());
		System.out.println(emails[2].toString().trim().toLowerCase().contains("@gmail.com")+ ": " + emails[2].toLowerCase());
		
	} 
}
