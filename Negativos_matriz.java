import java.util.Locale;
import java.util.Scanner;

public class Negativos_matriz {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int m,n, i, j;
		
		System.out.print("Quantas linhas: ");
		m = sc.nextInt();
		System.out.print("Quantas colunas: ");
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		//verificando negativos
		System.out.print("Valores negativos = ");
		for(i=0; i<m; i++) {
			for(j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		
		sc.close();

	}

}
