import java.util.Locale;
import java.util.Scanner;

public class Media_idades {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, cont;
		double soma, media;
		
		System.out.print("Informe a idade: ");
		idade = sc.nextInt();
		
		soma = 0;
		cont = 0;
		if (idade < 0) {
			System.out.print("Impossivel Calcular.");
		}else {
			while(idade > 0) {
				soma = soma + idade;
				cont++;
				
				System.out.print("Informe a idade: ");
				idade = sc.nextInt();
			}
			
			media = soma / cont;
			System.out.print("Media = " + String.format("%.2f", media));
		}
		sc.close();

	}

}
