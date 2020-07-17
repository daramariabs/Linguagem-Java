/*Problema "dentro_fora" (adaptado de URI 1072)
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo.*/
import java.util.Locale;
import java.util.Scanner;

public class Dentro_fora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, x, dentro, fora;
		
		System.out.print("Quantos numeros serao digitados: ");
		n = sc.nextInt();
		
		dentro = 0;
		fora = 0;
		
		for(i=0; i <n; i++) {
			System.out.print("Informe um numero: ");
			x = sc.nextInt();
			
			if (x >= 10 && x <=20) {
				dentro++;
			}else {
				fora++;
			}
		}
		
		System.out.println("Dentro = " + dentro);
		System.out.println("Fora = " + fora);
		
		sc.close();

	}

}
