//Exercício básico com break.

public class BreakBasico {

	public static void main (String[] args) {

		int i = 0;
		
		while (true) {

		System.out.println(i);

		i++;
			if (i>1000) { break; }
		}
	}
}