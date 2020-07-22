import java.util.Locale;
import java.util.Scanner;

public class Numeros_pares {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n,i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int cont = 0;
		System.out.print("Numeros pares = ");
		for(i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				System.out.print(vet[i] + " ");
				cont ++;
			}
		}
		System.out.println();
		
		System.out.println("Quantidade de numeros pares = " + cont);
		
		sc.close();
	}
}
