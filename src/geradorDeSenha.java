import java.util.Random;
import java.util.Scanner;

public class geradorDeSenha {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789"
                + "!@#$%&*"; 
		
		System.out.println("Digite o tamanho da senha: ");
		int tamanhoDaSenha = sc.nextInt();
		
		StringBuilder senha = new StringBuilder();
		
		//gerar senha
		
		for(int i = 0; i < tamanhoDaSenha; i++) {
			int indice = random.nextInt(caracteres.length());
			senha.append(caracteres.charAt(indice));
			
		}
		
		System.out.println("Senha gerada: " + senha.toString());

		sc.close();
	}

}
