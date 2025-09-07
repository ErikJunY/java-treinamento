package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Banco {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit? (y/n) ");
		char resposta = sc.next().charAt(0);
		
		if(resposta == 'y' || resposta == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double deposito = sc.nextDouble();
			conta = new Conta(number, nome, deposito);
		}
		else {
			conta = new Conta(number, nome);
		}
				
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double novo_deposito = sc.nextDouble();
		conta.deposito(novo_deposito);
		System.out.println("Update account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		System.out.println("Update account data:");
		conta.saque(saque);
		System.out.println(conta);
		
		sc.close();
	}

}
