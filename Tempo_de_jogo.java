import java.util.Scanner;

public class Tempo_de_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio, fim, duracao;
		
		System.out.print("Inicio: ");
		inicio = sc.nextInt();
		
		System.out.print("Fim: ");
		fim = sc.nextInt();
		
		if (inicio < fim) {
			duracao = inicio - fim;
		}else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.print("Duração do jogo: " + Math.abs(duracao) +" horas");
		sc.close();
	}

}
