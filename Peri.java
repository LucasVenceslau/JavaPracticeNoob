//Exercício de entrada de dados para calcular o perímetro de terrenos com até 5 lados em metros. Palávras sem acento para rodar no cmd.

import java.util.Scanner;

public class Peri{
	public static void main(String[] args){
	Scanner ler = new Scanner(System.in);
	double frente = 0, l1 = 0, l2 = 0, fundo = 0, outro = 0, perimetro;

	System.out.println("Voce dever digitar todos os valores com casas decimais separados por vírgula.\nExemplo:\nfrete: 7,0, lateral: 11,5, latgeral 2: 11,0, etc.");

	System.out.println("Digite a medida de frente: ");
	frente = ler.nextDouble();
	
	System.out.println("Digite a medida da lateral 1: ");
	l1 = ler.nextDouble();

	System.out.println("Digite a medida da lateral 2: ");
	l2 = ler.nextDouble();

	System.out.println("Digite a medida de fundo: ");
	fundo = ler.nextDouble();

	System.out.println("Digite a medida se houver mais um lado: ");
	outro = ler.nextDouble();

	perimetro = frente+l1+l2+fundo+outro;

	System.out.println("O perimetro do seu terreno e: "+perimetro+" "+"m");
	System.out.println("Iniciando Defcon 4, este computador e todos os dados serao destruidos em 5 segundos, corre miseravi!");

	}
}