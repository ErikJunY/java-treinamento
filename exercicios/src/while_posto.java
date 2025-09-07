import java.util.Scanner;

public class while_posto {

	public static void main(String[] args) {
			  
		Scanner sc = new Scanner(System.in);
		
		int  a1 = 0;
		int  g2 = 0;
		int  d3 = 0;
		
		int codigo = sc.nextInt();
		
		while(codigo != 4) {
			if (codigo == 1) {
				a1 = a1 + 1;
			}
			else if (codigo == 2) {
				g2 = g2 + 1;
			}
			else if (codigo == 3){
				d3 = d3 + 1;
			}
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + a1);
		System.out.println("Gasolina: " + g2);
		System.out.println("Diesel: " + d3);
		
		sc.close();
	}

}
