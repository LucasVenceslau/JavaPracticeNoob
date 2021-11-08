//Exercício de If e Else para determinar se um número é par ou ímpar. Sem acento para rodar no cmd

import java.util.Scanner;

public class ParImpar{
	public static void main(String[] args){
	int num;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um numero para saber se ele e par ou impar");	
	num = ler.nextInt();

	if ((num % 2) == 0){	//{} não são necessárias aqui por ser apenas um comando a ser executado, eu coloco porque me parece ficar mais organizado
		System.out.println("O numero "+num+" e par!");
			}
	else{
		System.out.println("O numero "+num+" e impar!");		
		}

	}
}