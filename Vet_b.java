//Exercício de vetor. Armazenar valores do teclado nos índices e determinar o maior e o menor valor do vetor.

import java.util.Scanner;

public class Vet_b {

	public static void main (String[] args) {
	
		int i, maior, menor;
	
		Scanner ler = new Scanner(System.in);

		int[] vet = new int[5];

		for (i = 0; i < 5; i++) {
			System.out.println ("Digite o valor para vet["+i+"]");
			vet[i] = ler.nextInt();
		}
		
		maior = menor = vet[0]; //como os índice podem ser números negativos, não deve iniciar as variáveis no início com 0.		

		for (i = 0; i < 5; i++) {
			if (vet[i] > maior) {
				maior = vet[i];

			}else if (vet[i] < menor){
				menor = vet[i];
			}	
		}		
		
			
		for (i = 0; i < 5; i++) {
			
			if (vet[i] == maior){
				System.out.println(vet[i]+ "<-- maior valor"); 
			
			}else if (vet [i] == menor){
				System.out.println(vet[i]+ "<-- menor valor");	

			}else { 
				System.out.println(vet[i]);
			}
		}
				
			
	
	}
}