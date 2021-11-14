//Exercício com vetor. Declaração do array, preenchimento dos índices, ordenação dos valores em ordem crescente.


import java.util.Scanner;
import java.util.Arrays;

public class Arr {

	public static void main (String[] args) {
	
	Scanner ler = new Scanner(System.in);	

		int[] var = new int[10];
		int i;	
		
		for (i = 0; i < 10; i++) {
		System.out.println("Digite um número inteiro:");
		var[i] = ler.nextInt();
		System.out.println(var[i]+"\n");
		}
		
		Arrays.sort(var);		

		for (int cont: var){

		System.out.println(cont);	
		}

	}
}