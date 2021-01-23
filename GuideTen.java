package main;

public class GuideTen {
	public static void main(String[] args) {
		ExempleTen.returnShort();
	}
}
class ExempleTen{
	    static Short returnShort() {
	    	String short1 = "32000";
	    	short  short2 = 32001;
	    	short  parseShort = Short.parseShort(short1);
	    	System.out.println("\n maximum value: "+Short.MAX_VALUE+" minimun value: "+Short.MIN_VALUE+
	    					   "\n String analisys: " + parseShort+
	    					   "\n Compare method: "+Short.compare(short2, parseShort));
		return null;
	}	    
}
