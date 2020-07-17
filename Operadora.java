import java.util.Locale;
import java.util.Scanner;

public class Operadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double excedeu;
		
		System.out.print("Informe os minutos utilizados: ");
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			excedeu = ((minutos - 100) * 2.0) + 50.0;
			System.out.print("Valor apagar = R$" + String.format("%.2f", excedeu));
			
		}else {
			System.out.print("Valor apagar = R$50.00 ");
		}
		sc.close();

	}

}
