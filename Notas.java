import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota_final;
		
		System.out.print("Informe a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		nota2 = sc.nextDouble();
		
		nota_final = nota1 + nota2;
		
		if(nota_final >= 60.0) {
			System.out.print("NOTA FINAL = " + String.format("%.1f", nota_final));
			
		}else {
			System.out.println("NOTA FINAL = " + String.format("%.1f", nota_final));
			System.out.print("REPROVADO.");
		}
		
		sc.close();

	}

}
