import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		do {
			System.out.print("Digite a senha: ");
			senha = sc.nextInt();
			
			if (senha == 1234) {
				System.out.println("Acesso permitido");	
			}
			else {
				System.out.println("Senha inválida, tente novamente");
			}
		} while(senha != 1234);
			
		
		sc.close();
	}

}
