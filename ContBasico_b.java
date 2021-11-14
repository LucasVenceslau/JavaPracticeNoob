//Exercício básico com continue para exibir apenas os múltiplos de 3 no intervalo de 0 a 300.

public class ContBasico_b {

	public static void main (String[] args) {
		
		int i;

		for (i = 0; i <= 300; i++) {

			if (i % 3 != 0) { continue; }
			
			System.out.println(i);
		}
	}
}