package application;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f ", vetor[i]);
		}
		System.out.println();
		
		double soma = 0;
		System.out.print("SOMA = ");
		for( int i = 0; i< n; i++) {
			soma += vetor[i];
		}
		System.out.printf("%.2f %n", soma);
		
		double media = soma / n;
		System.out.printf("MEDIA = %.2f %n",media);
		
		sc.close();
	}

}
