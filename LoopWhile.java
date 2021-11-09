//Exercício de loop com while. Sem acento para rodar no cmd. Todos os exercícios de lógica estão sendo feitos no bloco de notas.
import java.util.Scanner;

public class LoopWhile {
		public static void main (String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int i = 1, max = 10;
			
			System.out.println("Contando ate "+max+" rapidasso");
			
			while (i < max) {
				System.out.println(i);
				i++;
			}
			System.out.println(i); /* Quero que o último valor do i seja exibido
									* e não quero que de ++i depois disso, assim,
									*o 10 também será exibido.*/
		}
}
