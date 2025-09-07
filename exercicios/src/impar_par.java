import java.util.Scanner;

public class impar_par {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		System.out.println("Escreva um número e eu digo se é impar ou par:");
		numero = sc.nextInt();
		
		if (numero % 2 == 0 ) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
		
	}

}
