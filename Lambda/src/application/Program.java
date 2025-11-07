package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		Double minsalary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			List<String> emails = list.stream()
								.filter(e -> e.getSalary() > minsalary)//.filter(x -> x.getSalary() > salary)
								.sorted((e1, e2) -> e1.getEmail().toUpperCase().compareTo(e2.getEmail().toUpperCase()))//.map(x -> x.getEmail())
								.map(Employee::getEmail) //.sorted()
								.toList();//.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than" + String.format("%.2f", minsalary) + ":" );
			emails.forEach(System.out::println);
			
			Double sumsalaryM = list.stream()
								.filter(e -> e.getName().startsWith("M"))//.filter(x -> x.getName().charAt(0) == 'M')
								.mapToDouble(Employee::getSalary)//.map(x -> x.getSalary())
								.sum();//.reduce(0.0, (x, y) -> x + y);
								
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f" , sumsalaryM));
			
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();

	}

}
