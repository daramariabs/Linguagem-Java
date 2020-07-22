import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, abaixo, entre, acima;
		double lucro, percLucro, totCompra, totVenda, totLucro;
		
		System.out.print("Serao digitados dados de quantos produtos?");
		n = sc.nextInt();
		
		String[] vetNome = new String[n];
		double[] vetPcompra = new double[n];
		double[] vetPvenda = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.printf("Produto %d\n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			System.out.print("Preço de compra: ");
			vetPcompra[i] = sc.nextDouble();
			System.out.print("Preço de venda: ");
			vetPvenda[i] = sc.nextDouble();
		}
		
		abaixo = 0;
		entre = 0;
		acima = 0;
		
		for(i=0; i<n; i++) {
			lucro = vetPvenda[i] - vetPcompra[i];
			percLucro = lucro * 100 / vetPcompra[i];
			
			if(percLucro < 10) {
				abaixo++;
				
			}else if(percLucro <= 20) {
				entre++;
				
			}else {
				acima++;
				
			}	
		}
		
		totCompra = 0;
		totVenda = 0;
		
		for(i=0; i<n; i++) {
			totCompra = totCompra + vetPcompra[i];
			totVenda = totVenda + vetPvenda[i];
		}
		
		totLucro = totVenda - totCompra;
		
		System.out.println();
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		System.out.println("Valor total de compra: " + String.format("%.2f", totCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totVenda));
		System.out.print("Lucro total: " + String.format("%.2f", totLucro));
		
		sc.close();

	}

}
