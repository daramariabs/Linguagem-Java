import java.util.Locale;
import java.util.Scanner;

public class Experiencias {

	private static Scanner sc;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i, qtd, tot_sapo = 0, tot_rato = 0, tot_coelho = 0, tot_cobaia;
		char tipo;
		double perc_sapo, perc_rato, perc_coelho;
		
		System.out.print("Quantos casos de testes serão digitados: ");
		n = sc.nextInt();
		
		for (i = 0; i < n; i++) {
			System.out.print("Quantas cobaias: ");
			qtd = sc.nextInt();
			
			System.out.print("Tipo de cobaia: ");
			tipo = sc.next().charAt(0);
			
			if(tipo == 'c') {
				tot_coelho = tot_coelho + qtd;
				
			}else if(tipo == 's') {
				tot_sapo = tot_sapo + qtd;
				
			}else if(tipo == 'r') {
				tot_rato = tot_rato + qtd;
				
			}
			
		}
		
		tot_cobaia = tot_coelho + tot_sapo + tot_rato;
		
		perc_sapo = (double)(tot_sapo * 100) / tot_cobaia;
		perc_coelho = (double) (tot_coelho * 100) / tot_cobaia;
		perc_rato = (double) (tot_rato * 100) / tot_cobaia;
		
		System.out.println("Relatorio: ");
		System.out.println("Total de cobaias = " + tot_cobaia);
		System.out.println("Total de coelhos = " + tot_coelho);
		System.out.println("Total de sapos = " + tot_sapo);
		System.out.println("Total de ratos = " + tot_rato);
		System.out.println("Percentual de coelhos = " + String.format("%.2f", perc_coelho));
		System.out.println("Percentual de sapos = " + String.format("%.2f", perc_sapo));
		System.out.println("Percentual de ratos = " + String.format("%.2f", perc_rato));
		
		sc.close();

	}

}
