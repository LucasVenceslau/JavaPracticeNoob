//Exercícios de If e Else com string para confirmação de informações pelo usuário. Sem acento para rodar no cmd
import java.util.Scanner;

public class SimNao{
	public static void main(String[] args){
	int idade;
	float altura;
	String confirma;
	

	Scanner ler = new Scanner(System.in);

	System.out.println("Digite sua idade:");
	idade = ler.nextInt();

	System.out.println("Digite sua altura:");
	altura = ler.nextFloat();
	
	ler.nextLine();

	System.out.println("Deseja continuar? (digite S para sim ou N para nao)");
	confirma = ler.nextLine();
	

	ler.close();

	if (confirma.equals("s")){
		System.out.println("Veja a seguir os dados cadastrados:");
		System.out.println("Sua idade e: "+idade);
		System.out.println("Sua altura e: "+altura); 
			}
	else{
		System.out.println("Digite java SimNao para reiniciar seu cadastro");
		}
	}
}