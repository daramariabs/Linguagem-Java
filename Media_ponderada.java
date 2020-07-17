import java.util.Locale;
import java.util.Scanner;

/*Problema "media_ponderada" (adaptado de URI 1079)
Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
pela soma dos pesos.*/
public class Media_ponderada {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double v1, v2, v3, media;
		
		System.out.print("Quantos casos serao digitados: ");
		n = sc.nextInt();
		
		for(i=0; i<n; i++) {
			System.out.println("Informe tres valores: ");
			v1 = sc.nextDouble();
			v2 = sc.nextDouble();
			v3 = sc.nextDouble();
			
			media = (v1 * 2 + v2 * 3 + v3 * 5) / (2 + 3 + 5);
			
			System.out.println("Media = " + String.format("%.1f", media));
		}
		sc.close();

	}

}
