package application;

import java.util.Locale;
import java.util.Scanner;

public class Dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
		}
		
		double menor = altura[0];
		double maior = altura[0];
		
		for(int i = 1; i < n; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			}
			else if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		
		double somaFem = 0;
		int qtdFem = 0;
		int qtdMas = 0;
		
		
		for(int i = 0; i < n; i++) {
			if (genero[i] == 'F' || genero[i] == 'f') {
				somaFem = somaFem + altura[i];
				qtdFem = qtdFem + 1;
			}
			else {
				qtdMas = qtdMas + 1;
			}
		}
		double mediaFem = somaFem/qtdFem;
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaFem);
		System.out.printf("Numero de homens = %d%n", qtdMas);
		
		sc.close();
	}

}

