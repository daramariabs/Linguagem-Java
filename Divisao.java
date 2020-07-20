import java.util.Scanner;

public class Divisao {

	private static Scanner sc;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int num, den, i, n;
		double div;
		
		System.out.print("Quantos casos voce vai digitar: ");
		n = sc.nextInt();
		
		for(i = 0; i<n; i++) {
			System.out.print("Numerador: ");
			num = sc.nextInt();
			
			System.out.print("Denominador: ");
			den = sc.nextInt();
			
			if(den == 0) {
				System.out.println("DIVISÃO IMPOSSIVEL! ");
			}else {
				div = (double) num / den;
				
				System.out.println("DIVISÃO = " +String.format("%.2f", div));
			}
			
			
		}
		sc.close();

	}

}
