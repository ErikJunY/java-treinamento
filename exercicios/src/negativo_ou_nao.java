import java.util.Scanner;

public class negativo_ou_nao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		
		System.out.println("Escreva um número inteiro:");
		numero = sc.nextInt();
		System.out.println(numero >=0 ? "Não negativo" : "Negativo");
		
		sc.close();
		
	}

}
