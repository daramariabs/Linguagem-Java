import java.util.Locale;
import java.util.Scanner;

public class Soma_linhas {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int m, n, i, j;
		double soma;
		
		System.out.print("Quantidade de linhas: ");
		m = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		n = sc.nextInt();
		
		double[][] mat = new double[m][n];
		double[] vet = new double[m];
		for(i=0; i<m; i++) {
			System.out.printf("Digite os elementos da %da. linha:\n", i+1);
			for(j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		//preenchendo ventor
		
		for(i=0; i<m; i++) {
			soma = 0;
			for(j=0; j<n; j++) {
				soma = soma + mat[i][j];
			}
			vet[i] = soma;
		}
		
		System.out.println("Vetor gerado: ");
		for(i=0; i<m; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		sc.close();

	}

}
