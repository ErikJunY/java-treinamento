import java.util.Scanner;

public class while_quadrante {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		String quadrante;
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				 quadrante = "Primeiro";
			}
			else if (x > 0 && y < 0) {
				 quadrante = "Quarto";
			}
			else if (x < 0 && y > 0) {
				 quadrante = "Segundo";
			}
			else {
				 quadrante = "Terceiro";
			}
			System.out.println(quadrante);
			x = sc.nextInt();
			y = sc.nextInt();

			}
		
		sc.close();
	}

}
