//Exercício de Loop para mostrar quantos alunos do gênero masculino, feminino e neutro extistem em uma sala de aula de 20 alunos.

import java.util.Scanner;

public class Loop_b {

	public static void main (String[] args){
	Scanner ler = new Scanner(System.in);
	
	int i = 1, m=0, f=0, x=0;
	char genero;

	do {
		System.out.println("Digite seu gênero (m para masculino, f para feminino e x para neutro)");
		genero = ler.next().charAt(0);
			if((genero != 'm') && (genero != 'M') && (genero != 'f') && (genero != 'F') && (genero != 'x') && (genero != 'X')) {
			System.out.println("Gênero inválido, digite novamente");
			genero = ler.next().charAt(0);		
			}
			
			switch (genero){
			case 'f':
			case 'F':f++; break;
			case 'm':
			case 'M':m++; break;
			case 'x':
			case 'X':x++; break;			
			}
			
		i++;
	
	}while(i<=20);

	System.out.println(m+" mulheres");
	System.out.println(f+" homens");
	System.out.println(x+" neutros");
	}
}