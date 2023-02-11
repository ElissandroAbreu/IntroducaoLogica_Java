package exerciciosLaçodeRepetição;

import java.util.Scanner;

public class Dowhile_exercicio1 {

	public static void main(String[] args) {
		
		int n, n_positivo = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número: ");
			n = leia.nextInt();
			
			if(n > 0) {
				
				n_positivo = n + n_positivo;
			}
		} while(n != 0);
		
		System.out.println("\nA soma dos números positivos: "+n_positivo);
	}
}
