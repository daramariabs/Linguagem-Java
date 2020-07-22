import java.util.Locale;
import java.util.Scanner;

public class Matriz_geral {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, j, linha, coluna;
		double somaPositivo;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		double[][] mat = new double[n][n];
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		somaPositivo = 0;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if (mat[i][j] > 0) {
					somaPositivo = somaPositivo + mat[i][j];
				}
			}
		}
		System.out.println("SOMA DOS POSITIVOS: " + String.format("%.1f", somaPositivo));
		
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("Linha escolhida: ");
		for(i=0; i<n; i++) {
			System.out.print(String.format("%.1f", mat[linha][i]) + " ");
		}
		
		System.out.println();
		
		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("Coluna escolhida: ");
		for(i=0; i<n; i++) {
			System.out.print(String.format("%.1f", mat[i][coluna]) + " ");
		}
		
		System.out.println();
		
		System.out.print("DIAGONAL PRINCIPAL: ");
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(i == j) {
					System.out.print(String.format("%.1f", mat[i][j])+ " ");
				}
			}
		}
		
		System.out.println();
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if (mat[i][j] < 0) {
					mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		System.out.println("MATRIZ ALTERADA:");
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print(String.format("%.1f", mat[i][j]) + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
