//Exercício de If e Else para exibir a variável com número maior. Sem acento para rodar no cmd.

import java.util.Scanner;

public class Maior{
	public static void main(String[] args){
	
	int a,b,c;
	String confirma;

	Scanner ler = new Scanner(System.in);

	System.out.println("Digite um numero inteiro");
	a = ler.nextInt();
	System.out.println("Digite outro numero inteiro");
	b = ler.nextInt();
	System.out.println("Digite mais um numero inteiro");
	c = ler.nextInt();
	ler.nextLine(); //limpar buffer
	
	System.out.println("Você digitou os seguintes numeros:");
	System.out.println(a+", "+b+", "+c+". Digite S para continuar ou N para sair");
	confirma = ler.nextLine();
	
	if(confirma.equals("s")){
		if ((a>b)&&(a>c)){
			System.out.println("o maior valor e "+a);
			System.out.println("Para reiniciar o teste, digite java Maior");
		}else if(b>c){
			System.out.println("o maior valor e "+b);
			System.out.println("Para reiniciar o teste, digite java Maior");	
		}else{
			System.out.println("o maior valor e "+c);
			System.out.println("Para reiniciar o teste, digite java Maior");
			}	
	}else{
		System.out.println("Para reiniciar o teste, digite java Maior");
		}

	}
}