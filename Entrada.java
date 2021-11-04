//Exercício de entrada de dados
import java.util.Scanner;

public class Entrada{
	public static void main (String[] args){
	int a = 10, b = 20, c, d;
	Boolean test;

	System.out.println("A = "+a);
	System.out.println("B = "+b);
	c = a++; //c=10, a=11
	System.out.println("A = "+a);
	System.out.println("C = "+c);
	c = --a; //c=10, a=10
	System.out.println("A = "+a);
	System.out.println("C = "+c);
	
	Scanner ler = new Scanner (System.in);
	System.out.println("Digite um número:");
	d = ler.nextInt();

	System.out.println("D = "+d);
	test = d>b;
	System.out.println("D e maior que B? "+test);
	test = b>a;
	System.out.println("B e maior que A? "+test);
	}
}