//Exercício com controlador de fluxo de dados if. Tudo sem acento para rodar no cmd.
import java.util.Scanner;

public class Vel{
	public static void main(String[] args){
	int velocidade, velMax, dif;

	Scanner ler = new Scanner(System.in);

	System.out.println("Digite a velocidade maxima permitida");
	velMax = ler.nextInt();
	System.out.println("Digite a velocidade do veiculo");
	velocidade = ler.nextInt();
	dif = velocidade-velMax;
	
		if(dif>0){
		System.out.println("Motorista, você foi multado");
		}
	System.out.println("Sua velocidade: "+velocidade);
	System.out.println("Velocidade maxima: "+velMax);
	
	}
}