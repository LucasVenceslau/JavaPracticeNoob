//Exercício de loop com while para somar todos os números de 1 a 100. Sem acento para rodar no cmd. Feito no bloco de notas.

public class LoopWhile_b{

	public static void main (String[] args) {
	
	int i = 1, soma = 0; //boa prática: zerar a variavel e iniciar o contador.

		while (i <= 100) {
		soma += i;
		i++;
		}
	System.out.println ("A soma dos nímeros de 1 a 100 e: "+soma);
	}
}