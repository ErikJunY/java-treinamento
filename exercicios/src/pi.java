import java.util.Locale;
import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio;
		double area;
		double pi = 3.14159;
		
		System.out.println("Digite o raio do circulo em CM:");
		raio = sc.nextDouble();
		area = pi* Math.pow(raio, 2);
		System.out.printf("O valor da área é %.4f cm quadrados%n", area);
		System.out.println("Obrigado");
		
		sc.close();
	}

}
