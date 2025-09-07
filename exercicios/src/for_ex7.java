import java.util.Locale;
import java.util.Scanner;

public class for_ex7 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i ++) {
			int quadrado = i * i;
			int cubo = i * i * i;
			
			System.out.printf("%d %d %d %n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}
