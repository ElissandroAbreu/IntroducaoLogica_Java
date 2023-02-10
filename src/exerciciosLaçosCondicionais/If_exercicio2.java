package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class If_exercicio2 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		n = leia.nextInt();
		
		
		if(n % 2 == 0 && n > 0) {
			System.out.println("\nO número "+n+" é par e positivo");	
		}
		else if(n % 2 == 0 && n < 0) {
			System.out.println("\nO número "+n+" é par e negativo");
		}
		else if(n % 2 != 0 && n > 0) {
			System.out.println("\nO número "+n+" é ímpar e positivo");
		}
		else if(n % 2 != 0 && n < 0) {
			System.out.println("\nO número "+n+" é ímpar e negativo");
		} 
		else {
			System.out.println("\nOpção inválida!");
		}
		
		
		
		
		
	}

}
