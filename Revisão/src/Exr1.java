import java.util.Scanner;

public class Exr1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String user;
		String senha;
		
		do {
			
			System.out.println("Informe o Usuário: ");
			user = leitor.nextLine();
			System.out.println("Informe a senha: ");
			senha = leitor.nextLine();
			
		} while(senha.equals(user));

	}

}
