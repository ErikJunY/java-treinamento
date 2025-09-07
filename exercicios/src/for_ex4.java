import java.util.Locale;
import java.util.Scanner;

public class for_ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		Locale.setDefault(Locale.US);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão Impossivel");
			}
			else { 
				double divisao = x / y;
				System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();
	}

}
