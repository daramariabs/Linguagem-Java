import java.util.Locale;
import java.util.Scanner;

public class Acima_diagonal {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, j, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		soma = 0;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(i < j) {
					soma = soma + mat[i][j];
				}
			}
		}
		
		System.out.println("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		sc.close();

	}

}
