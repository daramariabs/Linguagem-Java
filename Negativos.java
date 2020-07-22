import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	private static Scanner sc;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.print("");
		System.out.println("Numeros negativos: ");
		for (i=0; i<n; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		sc.close();

	}

}
