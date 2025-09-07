import java.util.Scanner;

public class for_inout {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fora = 0;
		int dentro = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			
			if (x >= 10 && x <=20) {
				dentro = dentro + 1;
			}
			else {
				fora = fora + 1;
			}
		}
		
		System.out.println("dentro: " + dentro);
		System.out.println("Fora: " + fora);
		
		sc.close();
	
	}

}
