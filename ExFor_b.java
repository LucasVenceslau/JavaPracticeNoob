//Exercício básico de loop com for usando mais de uma variável dentro da repetição

public class ExFor_b {

	public static void main (String[] args) {
		int a,b;

		for (a = 1, b = 2; (a + b) < 20;a++,b+=2 ) {
			System.out.println(a+"+"+b+"= "+(a + b));
		}


	}
}