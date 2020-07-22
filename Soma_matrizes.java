import java.util.Locale;
import java.util.Scanner;

public class Soma_matrizes {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int m, n, i, j;
		
		System.out.print("Quantidade de linhas: ");
		m = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		n = sc.nextInt();
		
		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matC = new int[m][n];
		
		System.out.println("Digite os valores da matriz A: ");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matB[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		//gerando nova matriz
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}
		
		System.out.println("MATRIZ SOMA: ");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
