import java.util.Scanner;

public class Soma_impares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, x, y, soma;
		
		System.out.print("X: ");
		x = sc.nextInt();
		
		System.out.print("Y: ");
		y = sc.nextInt();
		
		soma = 0;
		
		if (x > y) {
			if(x % 2 != 0){//verificando se o x é impar
				x = x - 1;// sendo impar tira um
				for(i = x; i > y; i--) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}
			}else {
				for(i = x; i > y; i--) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}
			}
				
		}else {
			if(x % 2 != 0) {//verificando se é impar
				x = x + 1;// se for impar insere um
				for(i = x; i < y; i++) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}
			}else {
				for(i = x; i < y; i++) {
					if(i % 2 != 0) {
						soma = soma + i;
					}
				}	
			}	
		}
		System.out.print("Soma dos impares = " + soma);
		
		sc.close();
	}
}


