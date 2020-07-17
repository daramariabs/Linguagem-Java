import java.util.Locale;
import java.util.Scanner;

public class Validacao_nota {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Informe a primeira nota: ");;
		n1 = sc.nextDouble();
		
		while(n1 < 0 || n1 > 10) {
			System.out.print("Valor invalido! Tente novamente:");
			n1 = sc.nextDouble();
			
		}
		
		System.out.print("Informe a segunda nota: ");
		n2 = sc.nextDouble();
		
		while(n2 < 0 || n2 > 10) {
			System.out.print("Valor invalido! Tente novamente:");
			n2 = sc.nextDouble();
		}
		
		media = (n1 + n2) / 2;
		
		System.out.print("Media = " + String.format("%.2f", media));
		sc.close();

	}

}
