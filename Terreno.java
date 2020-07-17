import java.util.Locale;
import java.util.Scanner;

/*Problema "terreno"
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
duas casas decimais, conforme exemplo.*/

public class Terreno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valor_metro, area, preco_terreno;
		
		System.out.print("Digite a largura do terreno:");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado:");
		valor_metro = sc.nextDouble();
		
		area = largura * comprimento;
		preco_terreno = area * valor_metro;
		
		System.out.println("Area do terreno = " + String.format("%.2f", area));
		System.out.println("Preco do terreno = " + String.format("%.2f", preco_terreno));
		
		sc.close();
		
	}

}
