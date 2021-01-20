package main;

public class GuideThree {

	public static void main(String[] args) {
		Exemple.returnedPrint();
	}
}

class Exemple{
	static void returnedPrint() {
		
		Byte b1 = 022;
		Byte b2 = 020;
		String stgValue = "021";
		System.out.println("\n"+Byte.MAX_VALUE+"\n"
							   +Byte.MIN_VALUE +"\n"
						       +Byte.decode(stgValue)+"\n"
						       +Byte.compare(b1, b2));
		
	}
	
	
	
}
