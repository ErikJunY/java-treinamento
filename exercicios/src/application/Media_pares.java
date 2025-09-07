package application;

import java.util.Locale;
import java.util.Scanner;

public class Media_pares {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] numero = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numero[i] = sc.nextInt();
		}
		
		double somaPares = 0;
		double mediaPares = 0;
		int qtdPares = 0;
		
		for(int i = 0; i < n; i++) {
			if (numero[i] % 2 == 0) {
				somaPares = somaPares + numero[i];
				qtdPares = qtdPares + 1;
			}
		}
		
		if (qtdPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			mediaPares = somaPares/qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
		}
		
		sc.close();
	}

}
