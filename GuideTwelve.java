package main;

public class GuideTwelve {

	public static void main(String[] args) {
		System.out.println("\n --Randonamics --");
		GuideTwelve.forRandonamics();
		System.out.println("\n -- Constants --");
		GuideTwelve.forConstants();
		System.out.println("\n -- Operations --");
		GuideTwelve.forOperations();
		System.out.println("\n  --For adjusts --");
		GuideTwelve.forAdjusts();
		System.out.println("\n  -- Ulp --");
		GuideTwelve.forULP();
	}
	static void forRandonamics() {
		double f = Math.random()/Math.nextDown(1.0); //retorna um valor positivo, maior e igual 0 e menor que 1
		double x1 = 12, x2 = 3;
		double x = x1*(1.0 - f) + x2*f;
		System.out.println("\n randon = "+Math.rint(x));
	}
	static void forConstants() {
		System.out.println("\n return a PI constant: "+Math.PI+
						   "\n return a e(Neper) constant: "+Math.E);
	}
	static void forOperations() {
		System.out.println("\n multiply = "+Math.multiplyExact(2, 3)+ // faz mutiplicação a * b
				           "\n multiply + addition = "+Math.fma(2, 3, 10)+  // a * b + c faz a adicao multipla fundida dos tres argumentos);
				           "\n divison = "+Math.floorDiv(251, 22)+ // faz a divisao e retorno o maior valor mais proximo do quociente algébrico
						   "\n rest of division = "+Math.floorMod(251, 22)+ // retrona o resto da divisao
						   "\n returns sum = "+Math.addExact(10 ,15)+ // retorna a soma dos seus argumentos
						   "\n calc rest of operations IEEE 754 = "+Math.IEEEremainder(7, 2)+ //calcula o resto da operação /padrao IEEE 754
						   "\n base elevated to the exponent = "+Math.pow(2, 3)+ //retorna o valor elevado a potencia do primeiro para o segundo
						   "\n hypotenuza = "+Math.hypot(2, 2)+ // retorna a raíz quadrada da somado quadado de seus paramentros (hypotenusa dos números)
						   "\n root cubic = "+Math.cbrt(9)+ //retorna raiz cubica
						   "\n radiance = "+Math.sqrt(64)+ // faz a radiciação, uma operação inversa a potenciação 
						   "\n logarithm = "+Math.log(2)+ // retorna um logaritmo natural
						   "\n base ten logarithm = "+Math.log10(2)); //retorna um logaritmo base 10
	}
	static void forAdjusts() {
		System.out.println( "\n extracts to negative = "+Math.negateExact(16)+ //conveter para negativo
				 			"\n rounds = "+Math.round(1.9)+ //faz arrendonamento
				 			"\n incementet one = "+Math.incrementExact(10)+ // retorna o argumento incrementado em um
				 			"\n return float point afeter = "+Math.nextAfter(16 ,15)+ // retorna um ponto flutuante na direção do segundo argumento
				 			"\n return float ponint up = "+Math.nextDown(13)+ //retorna um ponto flutuante na direção do infinito negativo
							"\n return float ponint down = "+Math.nextUp(13)+ // retorna um ponto flutante na direcao do infinito negativo
							"\n get exponent = "+Math.getExponent(12)+ // retorna o expoente imparcial usado na respresentação
							"\n round to the next whole number = "+Math.ceil(13)+ //arredonda para numero inteiro seguinte
							"\n round to previous integer = "+Math.floor(10.9)+ //arredonda para numero inteiro anterior
							"\n returns value closest to the argument = "+Math.rint(12.4)+ //retorna o valor mais proximo do argumento
							"\n rounds the value = "+Math.abs(10.2)); //retorna o valor absoluto do parametro, torna qualuer valor positivo
	}
	static void forULP() {
		System.out.println("\n returns size of one ulp "+Math.ulp(12)); //Retorna o tamanho de um ulp do argumento
	}
}