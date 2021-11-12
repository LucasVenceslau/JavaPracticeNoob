//Exercício de cadastro usando do-while para evitar dados incorretos.

import java.util.Scanner;

public class Cadas {

	//As variávveis serão iniciadas como atributos privados antes da main, pois são dados sigilosos.

	private static String nome; //Deve ser static.
	private static int idade;
	private static char sexo;

	public static void main (String[] args) {

	Scanner ler = new Scanner (System.in);
	
	do {
		System.out.println ("Digite seu nome (de 6 a 100 caracteres): ");
		nome = ler.nextLine();
	} while (nome.length() < 6 || nome.length() > 100);

	do {
		System.out.println ("Digite sua idade (de 0 a 135 anos): ");
		idade = ler.nextInt();
	} while (idade < 0 || idade > 135);

	
	System.out.println ("Digite seu gênero (M, F ou X): ");
	sexo = ler.next().charAt(0); //Este fiz com if para comparar. Achei melhor usar if porque, caso inválido, ainda deu para colocar uma mensagem explicando o probema.
	
	if (sexo != 'm' && sexo != 'M' && sexo != 'F' && sexo != 'f' && sexo != 'x' && sexo != 'X') {
		System.out.println("Gênero inválido, digite F para feminino, M para masculino ou X para neutro ou caso não queira declarar");
		sexo = ler.next().charAt(0);
		}

	System.out.println ("Nome: "+nome);
	System.out.println ("Idade: "+idade);
	System.out.println ("Sexo: "+sexo);
	}
}