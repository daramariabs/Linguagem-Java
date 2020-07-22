import java.util.Locale;
import java.util.Scanner;

public class Cada_linha {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, j, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for(i=0; i<n; i++) {
			maior = 0;
			for(j=0; j<n; j++) {
				if(mat[i][j] > maior) {
					maior = mat[i][j];
				}
			}
			System.out.println(maior);
		}
		sc.close();

	}

}
