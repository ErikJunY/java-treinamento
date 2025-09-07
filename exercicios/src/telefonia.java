import java.util.Locale;
import java.util.Scanner;

public class telefonia {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double valor;
		
		if (minutos <= 100) {
			valor = 50;
		}
		else {
			valor = 50 + ((minutos - 100) * 2.00);
		}
		
		System.out.printf("Valor a pagar: R$%.2f%n", valor);
		sc.close();
	}

}
