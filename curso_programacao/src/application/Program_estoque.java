package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program_estoque {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();
		System.out.println("Update Data: " + product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int newquantity = sc.nextInt();
		product.removeProducts(newquantity);
		System.out.println();
		System.out.println("Update Data: " + product);
		
		
		
		
		
		
		sc.close();
	}

}
