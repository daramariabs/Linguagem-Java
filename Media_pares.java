import java.util.Locale;
import java.util.Scanner;

public class Media_pares {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, cont;
		double soma, media;
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		//media dos pares
		soma = 0;
		cont = 0;
		for(i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				soma = soma + vet[i];
				cont++;
			}
		}
		
		if(cont <= 0) {
			System.out.print("NENHUM NUMERO PAR");
		}else {
			media = soma / cont;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", media));
		}
		sc.close();

	}

}
