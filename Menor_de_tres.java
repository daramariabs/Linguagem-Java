import java.util.Scanner;

public class Menor_de_tres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.print("Informe o primeiro valor: ");
		x = sc.nextInt();
		
		System.out.print("Informe o segundo valor: ");
		y= sc.nextInt();
		
		System.out.print("Informe o terceiro valor: ");
		z = sc.nextInt();
		
		if (x < y && x < z) {
			System.out.print("MENOR = " + x);
			
		}else if(y < z) {
			System.out.print("MENOR = " + y);
			
		}else {
			System.out.print("MENOR = " + z);
			
		}
		sc.close();

	}

}
