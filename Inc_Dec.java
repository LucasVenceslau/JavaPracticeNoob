//Exercício com incremento e decremento

public class Inc_Dec {
	public static void main (String[] args){
	
	int a = 5,b,c,d;

	a++;
	
	b = a++; //b será igual a 6 e a será igual a 7. Primeiro, a é atribuído a b e depois recebe o incremento.
	c = --b; //c será 5 e b também será 5. Primeiro e tirado 1 do b e depois ele é atribuído ao c.
	d = c--; //d será igual a 5 e c ficará com 4. Primeiro, c é atribuído a d e depois recebe o decremento de menos 1.

	System.out.println(a+" "+b+" "+c+" "+d);
	}
}