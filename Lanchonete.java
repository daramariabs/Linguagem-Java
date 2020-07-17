import java.util.Locale;
import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, qtd;
		double pagar;
		
		System.out.print("Informe o codigo: ");
		codigo = sc.nextInt();
		
		System.out.print("Quantidade: ");
		qtd = sc.nextInt();
		
		if(codigo == 1) {
			pagar = 5.00 * qtd;
			System.out.print("Valor a pagar = R$" + String.format("%.2f", pagar));
			
		}else if(codigo == 2) {
			pagar = 3.50 * qtd;
			System.out.print("Valor a pagar = R$" + String.format("%.2f", pagar));
			
		}else if(codigo == 3) {
			pagar = 4.80 * qtd;
			System.out.print("Valor a pagar = R$" + String.format("%.2f", pagar));
			
		}else if(codigo == 4) {
			pagar = 8.90 * qtd;
			System.out.print("Valor a pagar = R$" + String.format("%.2f", pagar));
			
		}else if(codigo == 5) {
			pagar = 7.32 * qtd;
			System.out.print("Valor a pagar = R$" + String.format("%.2f", pagar));
			
		}
		
		sc.close();
	}

}
