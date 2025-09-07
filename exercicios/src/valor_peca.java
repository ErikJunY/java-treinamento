import java.util.Locale;
import java.util.Scanner;

public class valor_peca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, num, cod2, num2;
		double val, val2;
		
		System.out.println("Digite o código da peça 1, quantidade das peças e o valor da peça sem apertar ENTER, separe por espaço:");
		cod = sc.nextInt();
		num = sc.nextInt();
		val = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2, quantidade das peças e o valor da peça sem apertar ENTER, separe por espaço:");
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		val2 = sc.nextDouble();
		
		double valor_total = num * val + num2 * val2;
		
		System.out.printf("O valor total da compra foi de R$%.2f. %n", valor_total);
		
		sc.close();
		
	}

}
