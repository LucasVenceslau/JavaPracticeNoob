//Exercício básico com continue para exibir somente o números pares de uma sequência.

public class ContBasico {

	public static void main (String[] args) {
	
		int i = 0;

		while (i < 10) {
			i++;
	
			if ((i % 2) != 0 ) { continue; }	

			System.out.println(i);
		}
	}
}