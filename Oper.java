//Exercício de Operadores de atribuição, atribuição composta e Operadores aritméticos

public class Oper{
	public static void main(String[] args){
	
//Declaração de variáveis sem atribuição de dados:
	int x,y;
	double z,a,b,c,d;
//Atribuição de dados às variáveis com operadores de atribuição:
	x = 1;
	y = 2;
	z = 2.5;
	a = 1;
	b = 1;
	c = 1;
	d = 1;	
//Atribuição com operadores de atribuição composta:
	a+=x; //Tem que dar 2, ou seja a = a+x, ou, a = 1+1
	b-=y; //Tem que dar -1, b = b-y
	c*=z; //Tem que dar 2.5, c = c*z
	d/=y; //Tem que dar 0.5, d = d/y

	System.out.println("Variavel a = "+a);
	System.out.println("Variavel b = "+b);
	System.out.println("Variavel c = "+c);
	System.out.println("Variavel d = "+d);

//Depois das operações acima, o programa fará novas operações aritméticas a seguir e exibirá os resultados novos:
	b+= a; //Tem que dar 1
	c = a-b; //Tem que dar 1
	z*=x; //Tem que dar 5, pois o novo valor de x é 2, ou seja z = z*x que é z = 2.5*2
	a = z/x; //Tem que dar 2.5
	d = b%c;

//Exibição da segunda parte das operações:
	System.out.println("Variavel a = "+a);
	System.out.println("Variavel b = "+b);
	System.out.println("Variavel c = "+c);
	System.out.println("Variavel d = "+d);
	System.out.println("Variavel x = "+x);
	System.out.println("Variavel y = "+y);
	System.out.println("Variavel z = "+z);
	System.out.println("Variavel d = "+d);
						}					
						
		}