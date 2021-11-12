//Exercício de loop com for e break para ler 10 números inteiros digitados, calcular e exibir a soma deles.

import java.util.Scanner;

public class ExFor_c {

	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 0, numero = 0, soma = 0;
		
		for (;;) {
			System.out.println("Digite um número inteiro:");
			numero = ler.nextInt();
			soma += numero;
			if (i=10)
				break;
		}
	
		System.out.println("A soma dos números digitados é: "+soma);
	}
}