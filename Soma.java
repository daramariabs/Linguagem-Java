import java.util.Scanner;

/*Problema "soma"
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
números.*/
public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y, soma ;
		
		System.out.print("Informe o valor de X: ");
		X = sc.nextInt();
		
		System.out.print("Informe o valor de Y:");
		Y = sc.nextInt();
		
		soma = X + Y;
		
		System.out.print("SOMA = " + soma);
		sc.close();

	}

}
