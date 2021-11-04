//Exercício de operadores matemáticos para calcular o preço de venda de um produto

public class Preco{
	public static void main(String[] args){
	double precusto = 37.00, porlucro = 0.12, imposto = 0.2695, prevenda; //melhor usar o decimal na variável do que 12/100 e 26.95/100, o resultado dá errado
	
	prevenda = precusto+(precusto*porlucro)+(precusto*imposto);
	System.out.println("Preço final de venda = "+prevenda);

	
	}
}