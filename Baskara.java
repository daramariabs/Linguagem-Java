import java.util.Locale;
import java.util.Scanner;

public class Baskara {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, xi, xii, delta;
		
		System.out.print("Coeficiente A: ");
		a = sc.nextDouble();
		
		System.out.print("Coeficiente B: ");
		b = sc.nextDouble();
		
		System.out.print("Coeficiente C: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if(a == 0 || delta < 0) {
			System.out.println("A equacao nao possui raizes.");
		}else {
			xi = ((-b) + Math.sqrt(delta))/ 2 * a;
			xii = ((-b) - Math.sqrt(delta)) / 2 * a;
			
			System.out.println("XI = " + String.format("%.4f", xi));
			System.out.println("XII = " + String.format("%.4f", xii));
		}
		
		sc.close();

	}

}
