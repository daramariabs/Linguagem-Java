import java.util.Scanner;

public class Senha_fixa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Informe a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha invalida! Informe a senha novamente: ");
			senha = sc.nextInt();
		}
		
		System.out.print("Acesso permitido");
		
		sc.close();

	}

}
