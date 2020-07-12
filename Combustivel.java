import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod, cont_al, cont_gas, cont_dis;
		
		System.out.print("Informe um codigo: 1.Álcool 2.Gasolina 3.Diesel 4.Fim :");
		cod = sc.nextInt();
		
		cont_al = 0;
		cont_gas = 0;
		cont_dis = 0;
		
		while(cod != 4) {
			
			if(cod == 1) {
				cont_al++;
				
			}else if(cod == 2) {
				cont_gas++;
				
			}else if(cod == 3) {
				cont_dis++;
			}
			
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar:");
			cod = sc.nextInt();
		}
		
		System.out.println("Muito Obrigada.");
		System.out.println("Alcool = " + cont_al);
		System.out.println("Gasolina = " + cont_gas);
		System.out.print("Diesel = " + cont_dis);
		
		sc.close();

	}

}
