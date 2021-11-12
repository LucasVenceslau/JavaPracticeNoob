//Exercício de Loop para somar os 10 primeiros valores digitados e exibir o resultado na tela.

import java.util.Scanner;

public class Loop_a {

	public static void main (String[] args) {
	
	Scanner ler = new Scanner (System.in);

	int n, soma = 0;

	for (int i = 1; i<=10; i++) {

		System.out.println("Digite um número inteiro");
		n = ler.nextInt();
		soma += n;
	}
	
	System.out.println(soma);
	}
}