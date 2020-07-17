import java.util.Locale;
import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double X, Y;
		
		System.out.print("Informe X:");
		X =  sc.nextDouble();
		
		System.out.print("Informe Y: ");
		Y = sc.nextDouble();
		
		while(X != 0 && Y != 0) {
			
			if(X > 0 && Y > 0) {
				System.out.println("Q1");
				
			}else if(X < 0 && Y > 0) {
				System.out.println("Q2");
				
			}else if(X < 0 && Y < 0) {
				System.out.println("Q3");
				
			}else if(X > 0 && Y < 0) {
				System.out.println("Q4");
				
			}
			
			System.out.print("Informe X:");
			X =  sc.nextDouble();
			
			System.out.print("Informe Y: ");
			Y = sc.nextDouble();
		}
		sc.close();

	}

}
