import java.util.Locale;
import java.util.Scanner;

public class Somavetor {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		double soma;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double [n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.print("VALORES = ");
		for(i=0; i<n; i++) {
			System.out.print(String.format("%.2f", vet[i]) + " ");
		}
		System.out.println("");
		
		//somando vetor
		soma = 0;
		for(i=0; i<n; i++) {
			soma = soma + vet[i];
		}
		
		System.out.println("SOMA = " + String.format("%.2f", soma));
		
		System.out.println("MEDIA = " + String.format("%.2f", soma/n));
		sc.close();

	}

}
