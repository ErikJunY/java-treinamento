package application;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class ProgramEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		try {
			System.out.print("How many students for course A? ");
			int n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int id = sc.nextInt();
				set.add(new Student(id));
			}
			System.out.print("How many students for course B? ");
			n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int id = sc.nextInt();
				set.add(new Student(id));
			}
			System.out.print("How many students for course C? ");
			n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				int id = sc.nextInt();
				set.add(new Student(id));
			}
			
			System.out.println("Total students: " + set.size());
		}
		catch(InputMismatchException e) {
			System.out.println("Erro: você deve digitar apenas números inteiros!");
		}
		
		sc.close();
	}

}
