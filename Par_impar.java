/*Problema "par_impar" (adaptado de URI 1074)
Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
apenas NULO.*/
import java.util.Locale;
import java.util.Scanner;

public class Par_impar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, num;
		
		System.out.print("Quantos numeros serao digitados: ");
		n = sc.nextInt();
		
		for(i=0; i <n; i++) {
			System.out.print("Informe um numero: ");
			num = sc.nextInt();
			
			if(num == 0) {
				System.out.println("Nulo.");
				
			}else if(num % 2 == 0) {
				if(num > 0) {
					System.out.println("Par positivo.");
					
				}else {
					System.out.println("Par negativo.");
					
				}
			}else {
				if(num > 0) {
					System.out.println("Impar positivo.");
					
				}else {
					System.out.println("Impar negativo.");
				}
			}
		}
		
		
		sc.close();

	}

}
