import java.util.Locale;
import java.util.Scanner;

public class Medidas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, quadrado, retangulo,trapezio;
		
		System.out.print("Medida A: ");
		A = sc.nextDouble();
		
		System.out.print("Medida B:");
		B = sc.nextDouble();
		
		System.out.print("Medida C:");
		C = sc.nextDouble();
		
		quadrado = A * A;
		retangulo = (A *B) / 2;
		trapezio = ((A + B) / 2) * C;
		
		System.out.println("Area do Quadrado = " + String.format("%.4f", quadrado));
		System.out.println("Area do Retangulo = " + String.format("%.4f", retangulo));
		System.out.println("Area do Trapezio = " + String.format("%.4f", trapezio));
		
		sc.close();

	}

}
