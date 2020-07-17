/*Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um ret�ngulo. Em seguida, mostrar o valor
da �rea, per�metro e diagonal deste ret�ngulo, com quatro casas decimais, conforme exemplos*/
import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Informe o valor da base do retangulo: ");
		base = sc.nextDouble();
		
		System.out.print("Informe o valor da altura do retangulo: ");
		altura = sc.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.println("AREA = " + String.format("%.4f", area));
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		System.out.println("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();

	}

}
