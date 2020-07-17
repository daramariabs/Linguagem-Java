import java.util.Locale;
import java.util.Scanner;

/*Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente.*/
public class Troco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco_uni, dinheiro_cliente, troco;
		int quantidade;
		
		System.out.print("Informe o preco do produto: ");
		preco_uni = sc.nextDouble();
		
		System.out.print("Informe a quantidade: ");
		quantidade = sc.nextInt();
		
		System.out.print("Informe valor do dinheiro do cliente: ");
		dinheiro_cliente = sc.nextDouble();
		
		troco = dinheiro_cliente - (preco_uni * quantidade);
		
		System.out.print("TROCO = " + String.format("%.2f", troco));
		
		sc.close();

	}

}
