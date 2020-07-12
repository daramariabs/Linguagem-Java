import java.util.Locale;
import java.util.Scanner;

public class Dardo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double t_um, t_dois, t_tres;
		
		System.out.println("Digite as tres distancias: ");
		t_um = sc.nextDouble();
		t_dois = sc.nextDouble();
		t_tres =  sc.nextDouble();
		
		if(t_um > t_dois && t_um > t_tres) {
			System.out.print("MAIOR DISTANCIA = " + t_um);
			
		}else if(t_dois > t_tres) {
			System.out.print("MAIOR DISTANCIA = " + t_dois);
			
		}else {
			System.out.print("MAIOR DISTANCIA = " + t_tres);
		}
		sc.close();

	}

}
