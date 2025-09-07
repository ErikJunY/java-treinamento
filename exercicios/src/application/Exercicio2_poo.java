package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio2_poo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee funcionario = new Employee();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.printf("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		sc.nextLine();
		System.out.print("Tax: ");
		funcionario.tax = sc.nextDouble();
		sc.nextLine();
		System.out.println();
		
		System.out.println("Employee: " + funcionario);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		System.out.println();
		System.out.println("Updated data: " + funcionario);
		
		sc.close();
	}

}
