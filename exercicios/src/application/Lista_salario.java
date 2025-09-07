package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lista_funcionario;

public class Lista_salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lista_funcionario> lista = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.printf("Id: ");
			Integer id = sc.nextInt();
			while (temId(lista, id)) {
                System.out.print("Id already taken. Try again:: ");
                id = sc.nextInt();
            }
			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.printf("Salary: ");
			Double salary = sc.nextDouble();

			Lista_funcionario funcionario = new Lista_funcionario(id, name, salary);
			lista.add(funcionario);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that wil have salary increase: ");
		int idAumento = sc.nextInt();
		
		Integer posicao = posicaoId(lista, idAumento);
		//Lista_funcionario = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
		if (posicao == null) {
			System.out.println("This id does not exist");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			lista.get(posicao).aumento(porcentagem);
			
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Lista_funcionario funcionario : lista) {
			System.out.println(funcionario);
		}
		
		sc.close();
	}
	
	public static Integer posicaoId(List<Lista_funcionario> lista, int id){
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean temId(List<Lista_funcionario> lista, int id) {
        return lista.stream().anyMatch(x -> x.getId() == id);
    }

}
