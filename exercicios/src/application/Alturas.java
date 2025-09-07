package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + " pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			sc.nextLine(); 
			System.out.println();
		}
	
		double soma = 0;
		
		for(int i = 0; i < n; i++) {
			soma += altura[i];
		}
	
		double media = soma /n;
		System.out.printf("Altura média: %.2f%n", media);
		
		int menor16 = 0;
		for(int i = 0; i<n; i++) {
			if (idade[i] < 16) {
				menor16 ++;
			}
		}
		
		double porcentagem = (((double) menor16/n) *100);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		for(int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();
	}

}
