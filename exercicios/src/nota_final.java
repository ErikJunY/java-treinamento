import java.util.Locale;
import java.util.Scanner;

public class nota_final {

	public static void main(String[] args) {
		
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notafinal;
		
		System.out.println("Escreva a nota do primeiro e segundo semestre, respectivamente:");
		
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		
		notafinal = nota1 + nota2;
		
		System.out.printf("Nota final = %.1f%n", notafinal);
		
		if (notafinal < 60.00) {
			System.out.println("REPROVADO");
		}
		else {
			System.out.println("APROVADO");
		}
		
		sc.close();
	}

}
