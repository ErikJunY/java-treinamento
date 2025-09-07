import java.util.Locale;
import java.util.Scanner;

public class areas {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.println("Escreva os valores de A, B e C:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTri, areaCir, areaTra, areaQua, areaRet;
		double pi = 3.14159;
		
		areaTri = (A * C) /2;
		areaCir = pi * Math.pow(C, 2);
		areaTra = (A + B) *C/2;
		areaQua = Math.pow(B,2);
		areaRet = A*B;
		System.out.println();
		System.out.println("O valor das áreas é:");
		System.out.printf("Triangulo: %.3f %n", areaTri);
		System.out.printf("Circulo: %.3f %n", areaCir);
		System.out.printf("Trapezio: %.3f %n", areaTra);
		System.out.printf("Quadrado: %.3f %n", areaQua);
		System.out.printf("Retangulo: %.3f %n", areaRet);
		
		
		sc.close();
	}

}
