import java.util.Locale;
import java.util.Scanner;

public class Altura {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		double somaAltura, media, porcAltura;
		
		System.out.print("Quantos dados ira informar?");
		n = sc.nextInt();
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.printf("Dados da %d pessoa:\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
			System.out.print("Altura: ");
			vetAltura[i] = sc.nextDouble();
		}
		System.out.println();
		
		//somando altura
		somaAltura = 0;
		for(i=0; i<n; i++) {
			somaAltura = somaAltura + vetAltura[i];
		}
		media = somaAltura /n;
		
		//verificando menores de 16 anos
		int cont = 0;
		for(i=0; i<n; i++) {
			if(vetIdade[i] < 16) {
				cont++;
			}
		}
		porcAltura = (double)(cont * 100) / n;
		
		System.out.println("Altura media = " + String.format("%.2f", media));
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", porcAltura) + "%");
		
		//nomes menores de 16 anos
		for(i=0; i<n; i++) {
			if(vetIdade[i] < 16) {
				System.out.println(vetNome[i]);
			}
		}
		sc.close();

	}

}
