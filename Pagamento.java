import java.util.Locale;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double valor_hora, pagamento;
		int qtd_hora_trabalhada;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		
		System.out.print("Valor por hora: ");
		valor_hora = sc.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		qtd_hora_trabalhada = sc.nextInt();
		
		pagamento = valor_hora * qtd_hora_trabalhada;
		
		System.out.print("O pagamento para " + nome +" deve ser de R$" + String.format("%.2f", pagamento));
		sc.close();
	}

}
