
import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		
		System.out.print("Informe o valor de X: ");
		X = sc.nextInt();
		
		System.out.print("Informe o valor de Y: ");
		Y = sc.nextInt();
		
		while(X != Y) {
			
			if(X < Y) {
				System.out.println("CRESCENTE");
			}else {
				System.out.println("DECRESCENTE");
			}
			
			System.out.print("Informe o valor de X: ");
			X = sc.nextInt();
			
			System.out.print("Informe o valor de Y: ");
			Y = sc.nextInt();
		}
		sc.close();

	}

}
