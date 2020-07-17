import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char temperatura;
		double c, f;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)?");
		temperatura = sc.next().charAt(0);
		
		if (temperatura == 'c') {
			System.out.print("Digite a temperatura em celsius: ");
			c = sc.nextDouble();
			
			f = 9 * c / 5 + 32;
			System.out.print("Temperatura equivalente em Fahrenheit: "+ String.format("%.2f", f));
			
		}else {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			f = sc.nextDouble();
			
			c = 5.0 / 9.0 * (f - 32.0);
			System.out.print("Temperatura equivalente em Celsius: " + String.format("%.2f", c));
			
		}
		sc.close();
	}

}
