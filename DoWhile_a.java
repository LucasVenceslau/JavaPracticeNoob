//Exercício introdutório ao loop com do-while.

import java.util.Scanner;

public class DoWhile_a {

	public static void main (String[] args) {

	double nota;

	Scanner ler = new Scanner(System.in);

	do {
		System.out.println("Digite a nota");	
		nota = ler.nextDouble();
		
		if ((nota < 0) || (nota > 10)){
			System.out.println("Nota invalida, deve ser entre 0 e 10");
		}

		} while ((nota < 0) || (nota > 10));
	
	System.out.println("Nota: "+nota);

	}
}