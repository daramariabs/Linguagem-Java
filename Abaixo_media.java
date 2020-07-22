import java.util.Locale;
import java.util.Scanner;

public class Abaixo_media {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		double soma, media;
		
		System.out.print("Quantos valores vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um valor: ");
			vet[i] = sc.nextDouble();
		}
		
		//somando os valores do vetor para calcular a media
		soma = 0;
		for(i=0; i<n; i++) {
			soma = soma + vet[i];
		}
		media = soma/n;
		System.out.println("MEDIA DO VETOR = " + String.format("%.3f", media));
		
		//valores abaixo da media
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(i=0; i<n; i++) {
			if(vet[i] < media){
				System.out.println(String.format("%.1f", vet[i]));
			}
		}
		sc.close();
	}

}
