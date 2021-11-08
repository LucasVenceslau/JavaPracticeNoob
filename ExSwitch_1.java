//Exercício de estrutura de controle com switch-case usando dados tipo char. Sem acento para rodar no cmd

import java.util.Scanner;

public class ExSwitch_1{

	public static void main(String[] args){
	
	Scanner ler = new Scanner(System.in);
	
	char letra;
	
	System.out.println("Digite uma vogal");
	letra = ler.nextLine().charAt(0);

	switch(letra){
		case 'a': 
		case 'A': System.out.println("Vogal A"); break;
		case 'e': 
		case 'E': System.out.println("Vogal E"); break;
		case 'i': 
		case 'I': System.out.println("Vogal I"); break;
		case 'o': 
		case 'O': System.out.println("Vogal O"); break;
		case 'u': 
		case 'U': System.out.println("Vogal U"); break;
		default: System.out.println("Isso la e vogal, pae?"); break;
			}	

	}
}