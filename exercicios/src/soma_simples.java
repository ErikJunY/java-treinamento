import java.util.Scanner;

public class soma_simples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		System.out.println("Digite dois números inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		int z = x+y;
		System.out.printf("A soma dos dois números digitados é: %d %n",z);
		
		sc.close();
		
		
	}

}
