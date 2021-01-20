package main;

public class GuideFive {

	public static void main(String[] args) {
		ExempleFive.printParse();
	}
}
class ExempleFive{
	static void printParse() {
		String n1 = "10";
		int    n2 =  15;
		Integer decode = Integer.decode(n1);
		System.out.println("\n decodifica o valor em formato string, resultado: "+ decode +
						   "\n compara os dois valores, resultado: "+ Integer.compare(n2, decode) +
				           "\n faz divisão, resultado: "+ Integer.divideUnsigned(n2, decode)+
				           "\n imprime maior numero, resultado: " + Integer.max(n2, decode)+
				           "\n faz a soma, resultado: "+ Integer.sum(decode, n2));
	}
}
