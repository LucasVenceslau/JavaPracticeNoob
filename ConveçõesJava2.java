//A classe public static void main seguida das conveções contém tudo que o programa vai fazer assim que for aberto.

public class main {
	
	public static void main(String args []) {
		
			Trial trail = new Trail();
				trail.setDescricao ("Trail Version Expiration");
				trail.setCodigo(123);
				trail.setPreco(10.00);
				trail.setDataExpiracao(LocalDate.parse("2020-12-15"));
				
			Programa programa = new Programa ();
				programa.exibirDiasAteExpirar(assinatura);
	}
}