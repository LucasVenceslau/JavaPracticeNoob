//Exercício de operadores relacionais com boolean

public class OperRel{
	public static void main(String[] args){
		int x = 5, y = 10, z;
		float a = 4.5f, b;
		double c, d;
		char e;
		long f;
		boolean teste;
	x++; //x passa a valer 6
	System.out.println("X = "+x);
	z = y--; //z passa a ser 10 e y recebe o decremento e passa a ser 9
	System.out.println("Y = "+y+" Z = "+z);
	b = a+x; //b é float e recebe uma operação entre int e float, resultando em float. b será igual a 10.5.
	System.out.println("A = "+a+" B = "+b);
	c = 15/2; //c é double, mas 15 e 2 são int, só a parte inteira aparece. Para aparecer como double, adicionace a parte decimal. Aqui, aparecerá 7, a parte inteira
	System.out.println("C = "+c);
	c = 15.0/2.0; //agora c vai mostrar o valor real, pois os números da operação também são reais
	System.out.println("C real = "+c);
	d = a; //tanto d quant a são reais. d é double e a é float. Nesse caso, ao receber a, d passa a ser float
	System.out.println("D = "+d); //d passa a ser 4.5
	e = 'a';
	System.out.println("E = "+e);
	f = x+y+z; //o resultado converterá f, que é long, em int, pois as variáveis somadas são int
	System.out.println("F = "+f);
	teste = z>y; //vai ser true, porque z é 10 e y é 9
	System.out.println("Teste = "+teste);
	}
}
