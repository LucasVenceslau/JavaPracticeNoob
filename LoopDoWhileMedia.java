// Exercício de média com Loop para evitar dados inválido. Calcular a média de um grupo de 10 al

import java.util.Scanner;

public class LoopDoWhileMedia{

	public static void main(String[] args){
	
	Scanner ler = new Scanner(System.in);

	int idade = 0, soma = 0, i = 0, numero;
	double media;
	
	System.out.println("Digite o número de alunos da sua turma");
	numero = ler.nextInt();

	do {
		System.out.println("Digite uma idade");
		idade = ler.nextInt();
	
		if ((idade <= 0) || (idade > 135)) {
		
			System.out.println("Idade inválida, digite novamente");
			idade = ler.nextInt();
		}
		
		soma += idade;
		
		i++;
			

	} while (i<numero);
	
	media = (soma / numero);

	System.out.println("A média das idades dessa turma é de: "+media);

	}
}