import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	List<Integer> lista = new ArrayList<Integer>();
    	int par = 0;
    	int impar = 0;
    	
    	System.out.println("Digite os 10 números: ");
    	for(int i=0; i<10; i++) {
    		int numero = sc.nextInt();
    		if(numero % 2 == 0) {
    			par = numero + par; 
    		}
    		else {
    			impar = numero + impar;
    		}
    	}
    	
    	System.out.println();
    	System.out.println("Soma dos numeros pares: " + par);
    	System.out.println("Soma dos numeros impares: " + impar);
    	
    	sc.close();
    }
}