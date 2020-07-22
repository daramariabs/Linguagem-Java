import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
	private static Scanner sc;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		sc = new Scanner(System.in);
		
		int n, i;
		double media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String[] vetNome = new String[n];
		double[] vetN1 = new double[n];
		double[] vetN2 = new double[n];
		
		for(i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i+1);
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			vetN1[i] = sc.nextDouble();
			vetN2[i] = sc.nextDouble();
		}
		
		//verificando os aprovados
		System.out.println("Alunos aprovados: ");
		for(i=0; i<n; i++) {
			media = (vetN1[i] + vetN2[i]) / 2;
	
			if(media >= 6.0) {
				System.out.println(vetNome[i]);
			}
		}
		sc.close();

	}

}
