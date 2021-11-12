//Exercício de loop com do-while para determinar se uma idade inserida é válida e, quando for, encerrar a repetição. Sem acento para rodar no cmd. Feito no bloco de notas.
import java.util.Scanner;

public class LoopDoWhile_b{

	public static void main (String[] args) {
	
	Scanner ler = new Scanner(System.in);

	int idade;
		
		do 
		{
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();
		} while ((idade < 0) || (idade > 150));
	
	}
}