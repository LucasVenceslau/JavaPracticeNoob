//Exercício de If e Else para saber se um ano é bissexto ou não. Sem acento para rodar no cmd.

import java.util.Scanner;

public class Bissexto{
	public static void main(String[] args){
	
	int ano;
	
	Scanner ler = new Scanner(System.in);

	System.out.println("Digite o ano para saber se ele e bissexto");
	ano = ler.nextInt();

	if((ano%400)==0 || (ano%4==0) && (ano%100>0)){
		System.out.println("O ano "+ano+" e bissexto");
		} else{
			System.out.println("O ano "+ano+" nao e bissexto");
			}
	}
}
