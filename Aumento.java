import java.util.Locale;
import java.util.Scanner;

public class Aumento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, aumento, novo_salario;
		int porcetagem;
		
		System.out.print("Informe o salario: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.00) {
			porcetagem = 20;
			aumento = (porcetagem * salario) / 100;
			novo_salario = salario + aumento;
			
		}else if (salario <= 3000.00) {
			porcetagem = 15;
			aumento = (porcetagem * salario) / 100;
			novo_salario = salario + aumento;
			
		}else if(salario <= 8000.00) {
			porcetagem = 10;
			aumento = (porcetagem * salario) / 100;
			novo_salario = salario + aumento;
			
		}else {
			porcetagem = 5;
			aumento = (porcetagem * salario) / 100;
			novo_salario = salario + aumento;
			
		}
		
		System.out.println("NOVO SALARIO = R$" + String.format("%.2f", novo_salario));
		System.out.println("AUMENTO = R$" + String.format("%.2f", aumento));
		System.out.println("PORCENTAGEM = " + porcetagem + "%");
		
		sc.close();

	}

}
