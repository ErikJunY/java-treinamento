import java.util.Locale;
import java.util.Scanner;

public class intervalos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double intervalo;
		
		System.out.println("Escreva um número de 1 a 100.");
		intervalo = sc.nextDouble();
		
		if(intervalo < 0) {
			System.out.println("Fora do intervalo");
		}
		else if (intervalo <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (intervalo <= 50.00 ) {
			System.out.println("Intervalo [25,50]");
		}
		else if (intervalo <= 75.00) {
			System.out.println("Intervalo [50,75]");
		}
		else if (intervalo <= 100.00) {
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Fora do intervalo");
		}
		
		sc.close();
	}

}
