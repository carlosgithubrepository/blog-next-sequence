package main;

public class GuideEleven {
	public static void main(String[] args) {
		ExempleEleven.returnEleven();
	}
}
class ExempleEleven{
	static Number returnEleven() {
		Number year = 2021000000;
		System.out.println("\n year in float = "+year.floatValue()+
						   "\n year in long = "+year.longValue()+ 
						   "\n year in double = "+year.doubleValue()+
						   "\n year in int = "+year.intValue()+
						   "\n year in short = "+year.shortValue()+
						   "\n year in byte = "+year.byteValue());
		return null;
	} 
}
