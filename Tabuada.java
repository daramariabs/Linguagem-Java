import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("Deseja a tabuada para qual valor?");
		n = sc.nextInt();
		
		for(i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i +" = " + i*n );
		}
		
		sc.close();

	}

}
