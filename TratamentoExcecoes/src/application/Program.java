package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double inicialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, inicialBalance, withdrawLimit);
				
		System.out.println();
		System.out.println("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		}
		catch (BusinessException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
