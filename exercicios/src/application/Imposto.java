package application;

import java.util.ArrayList; 
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.IndividualPerson;
import entities.LegalPerson;
import entities.Person;

public class Imposto {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or legal (i/l)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			sc.nextLine();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenses = sc.nextDouble();
				lista.add(new IndividualPerson(name, renda, healthExpenses));
			}
			else if(type == 'l') {
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				lista.add(new LegalPerson(name, renda, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double soma = 0;
		
		for(Person person : lista) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.calculoImposto())  );
			soma += person.calculoImposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: " + soma);
		
		sc.close();
	}

}
