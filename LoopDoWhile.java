/* Exercício de Loop com do-while.
 * Este tem o mesmo exercício do exemplo só com while,
 * mas não precisa da gambiarra no final.
 * Neste caso, o último i mostrado também é o último exibido.*/
 
import java.util.Scanner;

public class LoopDoWhile {
		public static void main (String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int i = 1, max = 10;
			
			System.out.println("Contando ate "+max+" rapidasso");
			
			do {
			i++;
			System.out.println(i);
			} while (i<10);
		}	
	}	