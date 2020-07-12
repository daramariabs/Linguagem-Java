import java.util.Locale;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, area;
		
		System.out.print("Informe o valor do raio do ciruclo: ");
		r = sc.nextDouble();
		
		area = Math.PI * Math.pow(r, 2);
		
		System.out.print("AREA = " + String.format("%.3f", area));
		sc.close();
	}

}
