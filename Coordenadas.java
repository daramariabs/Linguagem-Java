import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		System.out.print("Informe X: ");
		x = sc.nextDouble();
		
		System.out.print("Informe Y: ");
		y = sc.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.print("Q1");
			
		}else if(x < 0 && y > 0) {
			System.out.print("Q2");
				
		}else if (x < 0 && y < 0) {
			System.out.print("Q3");
			
		}else if(x > 0 && y < 0) {
			System.out.print("Q4");
			
		}else if (x == 0 && y == 0) {
			System.out.print("ORIGEM");
			
		}else if (x == 0) {
			System.out.print("EIXO Y");
			
		}else if (y == 0) {
			System.out.print("EIXO X");
			
		}
		
		sc.close();

	}

}
