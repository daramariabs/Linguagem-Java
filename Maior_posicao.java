import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, indice;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		maior = 0;
		indice = 0;
		for(i=0; i<n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				indice = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		System.out.print("POSICAO DO MAIOR VALOR = " + indice);
		sc.close();

	}

}
