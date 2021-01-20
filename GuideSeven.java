package main;

public class GuideSeven {
	public static void main(String[] args) {
		ExempleSeven.returnDouble();
	}
}
class ExempleSeven{
	static Double returnDouble() {
		Double latitude = -23.6200794; 	
		String longitude = "-46.566063"; 
		String parse = latitude.toString();
		
		System.out.println("sum: "+ Double.sum(Double.parseDouble(longitude), latitude));
		System.out.println("Value in string:" + parse);
		System.out.println("Return long value: "+latitude.longValue());
		return null; 
	}
}