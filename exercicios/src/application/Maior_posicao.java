package application;

import java.util.Locale;
import java.util.Scanner;

public class Maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		double maior = numeros[0];
		int posMaior = 0;
		
		for(int i=1; i<n; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
				posMaior = i;
			}
		}
		System.out.println();
		System.out.printf("MAIOR VALOR = %.2f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posMaior);
		
		sc.close();
	}

}
