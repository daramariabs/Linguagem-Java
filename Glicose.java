import java.util.Scanner;

public class Glicose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Medida glicose: ");
		glicose = sc.nextDouble();
		
		if(glicose <= 100) {
			System.out.print("Classificacao: Normal");
			
		}else if(glicose <= 140) {
			System.out.print("Classificacao: Elevado");
			
		}else {
			System.out.print("Classificacao: Diabetes");
			
		}
		sc.close();

	}

}
