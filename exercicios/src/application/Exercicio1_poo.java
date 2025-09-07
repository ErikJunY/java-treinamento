package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Exercicio1_poo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		
		System.out.println("Enter rectangle whidth and height:");
		ret.largura = sc.nextDouble();
		ret.altura = sc.nextDouble();
		
		System.out.printf("AREA = %.2f %n", ret.area());
		System.out.printf("PERIMETER = %.2f %n", ret.perimeter());
		System.out.printf("DIAGONAL = %.2f %n", ret.diagonal());
		
		sc.close();
	}

}
