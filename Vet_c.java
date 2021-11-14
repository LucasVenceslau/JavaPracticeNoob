//Exercício para armazenar 10 notas de alunos em um vetor e calcular a média de notas da turma

import java.util.Scanner;

public class Vet_c {

	public static void main (String[] args) {
	Scanner ler = new Scanner(System.in);

		int i, media = 0, numAlunos = 0;
		System.out.println("Digite o número de alunos da turma");
		numAlunos = ler.nextInt();
		
		int chamada[] = new int[numAlunos];
		int[] notas = new int[numAlunos];

		for(i = 0; i < numAlunos; i++) {
		chamada[i] = (i + 1);
		}

		for (i = 0; i < numAlunos; i++){
			System.out.println("Digite a nota do aluno número: "+chamada[i]);
			notas[i] = ler.nextInt();
		}		
		
		for (i = 0; i < numAlunos; i++){
		media = media + notas[i];
		
		}
		media = media/numAlunos;
		System.out.println("A média dessa turma é: "+media);
	}
}