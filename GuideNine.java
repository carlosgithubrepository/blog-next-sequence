package main;

public class GuideNine {
	public static void main(String[] args) {
		ExempleNine.retunLong();
	}
}
class ExempleNine{
	static Long retunLong() {
		long number1 =    999999999; //maximum allowed in the field is nine digits
		String number2 = "999999999";
		long calc = number1 * Long.parseLong(number2);
		System.out.println("\n max value for long = " + Long.MAX_VALUE+"\n");
		System.out.println("\n calc multiplying =   "+ calc +
						   "\n rest of divison from the first to the second  = "+ Long.remainderUnsigned(number1, calc));
		return null;
	}
}