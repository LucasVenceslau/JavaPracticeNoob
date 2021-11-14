//Exercício básico de vetor para armazenar números inteiros através do teclado.

import java.util.Scanner;

public class Vet_a {

	public static void main (String[] args) {

		Scanner ler = new Scanner (System.in);

		int i, indices;
		
		System.out.println("Digite o número de índices do vetor");
		indices = ler.nextInt();

		int[] vet = new int [indices];
		
		for (i = 0; i < indices; i++) {
			System.out.println("Digite o valor para o íncdice "+i);
			vet[i] = ler.nextInt();
		}

		for (i = 0; i < indices; i++) {
			System.out.println("O vetor do índice " + i + " contém o valor: " + vet[i]);
		}
	}
}