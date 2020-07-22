import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, cont, contMasc;
		double maior, menor, soma, media;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double[] vetAltura = new double[n];
		char[] vetGenero = new char[n];
		
		for(i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			vetAltura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			vetGenero[i] = sc.next().charAt(0);
		}
		
		//maior altura
		maior = 0;
		for(i=0; i<n; i++) {
			if(vetAltura[i] > maior) {
				maior = vetAltura[i];
			}
		}
		
		//menor altura
		menor = maior;
		for(i=0; i<n; i++) {
			if(vetAltura[i] < menor) {
				menor = vetAltura[i];
			}
		}
		
		//media de altura das mulheres
		soma = 0;
		cont = 0;
		for(i=0; i<n; i++) {
			if(vetGenero[i] == 'f') {
				soma = soma + vetAltura[i];
				cont++;
			}
		}
		media = soma / cont;
		
		//quantidade de homens
		contMasc = n - cont;
		
		System.out.println("Menor altura = " + String.format("%.2f", menor));
		System.out.println("Maior altura = " + String.format("%.2f", maior));
		System.out.println("Media das alturas das mulheres = " + String.format("%.2f", media));
		System.out.println("Numero de homens = " + Math.abs(contMasc));
		sc.close();

	}

}
