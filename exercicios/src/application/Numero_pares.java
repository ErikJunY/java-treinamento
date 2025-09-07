package application;

import java.util.Locale;
import java.util.Scanner;

public class Numero_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int[] numeros = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Numeros Pares: ");
		for (int i=0; i<n; i++) {
			if(numeros[i] % 2 == 0){
				System.out.print(numeros[i] + " ");;
			}
		}
		System.out.println();
		System.out.println();
		int soma = 0;
		for (int i=0; i<n; i++) {
			if(numeros[i] % 2 == 0){
				soma ++;
			}
		}
		System.out.printf("Quantidade de Pares = %d%n", soma);
		

		sc.close();
	}

}
