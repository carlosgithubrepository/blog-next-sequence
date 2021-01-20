package main;

public class GuideTwo {

	public static void main(String[] args) {
		Result.view();
	}
}

class Result{
	
	static void view() {
		String vm = "java.vm.name";
		String arc = "os.arch";
		
		System.out.println(System.getProperties().getProperty(vm) +"\n" 
	    		         + System.getProperties().getProperty(arc) +"\n"
	    		         + System.LoggerFinder.getLoggerFinder()); 	      
	}
	
}