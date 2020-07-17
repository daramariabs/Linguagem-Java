import java.util.Locale;
import java.util.Scanner;

public class Troco_verificado {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco_uni, dinheiro, troco, tot;
		int qtd;
		
		System.out.print("Preço do produto: ");
		preco_uni = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		qtd = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		tot = preco_uni * qtd;
		
		if (dinheiro >= tot) {
			troco = dinheiro - tot;
			System.out.print("TROCO = " + String.format("%.2f", troco));
			
		}else {
			troco = dinheiro - tot;
			System.out.print("Dinheiro insuficiente. Faltam " + String.format("%.2f",Math.abs(troco)) + " reais.");
			
		}
		sc.close();

	}

}
