import java.util.Locale;
import java.util.Scanner;

public class Diagonal_negativos {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i,j, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		//diagonal principal
		System.out.print("DIAGONAL PRINCIPAL = ");
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		System.out.println();
		
		//quantidade de negativos
		cont = 0;
		for(i=0; i<n; i++) {
			for(j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NEGATIVOS = " + cont);
		sc.close();
	}

}
