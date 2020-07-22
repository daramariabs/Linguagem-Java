import java.util.Locale;
import java.util.Scanner;

public class Mais_velho {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, maisVelho;
		String nome;
		
		System.out.print("Quantos dados serao digitados? ");
		n = sc.nextInt();
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
		}
		
		//verificando maior idade
		maisVelho = 0;
		nome = null;
		for(i=0; i<n; i++) {
			if(vetIdade[i] > maisVelho) {
				maisVelho = vetIdade[i];
				nome = vetNome[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nome );
		sc.close();

	}

}
