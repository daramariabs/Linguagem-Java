import java.util.Locale;
import java.util.Scanner;

public class Fatorial {

	private static Scanner sc;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, f;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		f = 1;
		
		if(n < 15) {
			for(i=n; i>0; i--) {
				f = f * i;
			}
		}else {
			System.out.print("VALOR INVALIDO! Valor maximo possivel é 15!");
		}
		
		System.out.print("Fatorial = " + f);
		sc.close();

	}

}
