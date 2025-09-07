import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite dois numeros e eu te falo se eles são multiplos um do outro:");
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A % B == 0 || B % A == 0) {
			System.out.println("São multiplos.");
		}
		else {
			System.out.println("Não são multiplos.");
		}
		
		sc.close();
	}

}
