package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dollar;

public class ExercicioStatico {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price: ");
		Dollar.dollar = sc.nextDouble();
		System.out.print("How many dollars wil be bought?  ");
		Dollar.qtnDollar = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", Dollar.valorComImposto());
		
		sc.close();
	}

}
