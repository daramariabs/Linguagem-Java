import java.util.Scanner;

public class Pares_consecutivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, cont, soma;
		
		System.out.print("Informe um valor: ");
		x = sc.nextInt();
		
		
		while(x != 0) {
			cont = 0; 
			soma = 0;
			
			if(x % 2 == 0) {
				while(cont < 5) {
					soma = soma + x;
					x = x + 2;
					cont++;
				}
				System.out.println("SOMA = " + soma);

			}else {
				x = x + 1;
				while(cont < 5) {
					soma = soma + x;
					x = x + 2;
					cont++;
				}
				System.out.println("SOMA = " + soma);
				
			}
			
			System.out.print("Informe um valor: ");
			x = sc.nextInt();
		}
		sc.close();

	}

}
