import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("Informe o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Informe o segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			System.out.print("S�O MULTIPLOS.");
			
		}else {
			System.out.print("N�O S�O MULTIPLOS.");
		}
		sc.close();

	}

}
