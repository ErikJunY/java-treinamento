import java.util.Locale;
import java.util.Scanner;

public class salario_funcionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int h;
		double valor_h;
		
		System.out.println("Digite seu número de cadastro, a quantidade de horas e o seu valor por hora, respectivamente:");
		n = sc.nextInt();
		h = sc.nextInt();
		valor_h = sc.nextDouble();
		
		double salario = h * valor_h;
		System.out.println("Number = " + n);
		System.out.printf("Salary = U$%.2f %n", salario);
		
		
		sc.close();
		
	}

}
