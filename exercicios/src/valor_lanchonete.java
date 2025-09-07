import java.util.Locale;
import java.util.Scanner;

public class valor_lanchonete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo, quant;
		double valortotal;
		
		System.out.println("Escreva o codigo do produto e a quantidade, respectivamente:");
		codigo = sc.nextInt();
		quant = sc.nextInt();
		
		switch (codigo) {
		case 1:
			valortotal = quant * 4.00;
			break;
		case 2:
			valortotal = quant * 4.50;
			break;
		case 3:
			valortotal = quant * 5.00;
			break;
		case 4:
			valortotal = quant * 2.00;
			break;
		case 5:
			valortotal = quant * 1.50;
			break;
		default:
			valortotal = 0;
			System.out.println("Código inválido.");
			break;
		}
		
		System.out.printf("Valor total= R$%.2f%n", valortotal);
	    
		sc.close();
	}

}
