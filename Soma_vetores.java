import java.util.Locale;
import java.util.Scanner;

public class Soma_vetores {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		int[] vetA = new int[n];
		int[] vetB = new int[n];
		int[] vetC = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(i=0; i<n; i++) {
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(i=0; i<n; i++) {
			vetB[i] = sc.nextInt();
		}
		
		//genrando vetor soma
		for(i=0; i<n; i++) {
			vetC[i] = vetA[i] + vetB[i];
		}
		
		System.out.println("Vetor resultante: ");
		for(i=0; i<n; i++) {
			System.out.println(vetC[i]);
		}
		sc.close();

	}

}
