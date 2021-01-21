package main;

public class GuideEigth {
	public static void main(String[] args) {
		ExempleEigth.returnFloat();
	}
}
class ExempleEigth{
	static Float returnFloat() {
		float lastYear = 2020;
		String newYear = "2021";
	
		System.out.println("\n compare: "+Float.compare(lastYear, Float.parseFloat(newYear))+
						   "\n number is infinite? :"+Float.isInfinite(lastYear)+
						   "\n print of float format : "+Float.valueOf(lastYear));
		return null;
	}	
}
	
