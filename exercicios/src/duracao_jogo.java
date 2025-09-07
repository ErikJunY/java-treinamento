import java.util.Scanner;

public class duracao_jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		int duracao;
		
		if(horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O jogo durou %d hora(s).", duracao);
		
		
		sc.close();
	}

}
