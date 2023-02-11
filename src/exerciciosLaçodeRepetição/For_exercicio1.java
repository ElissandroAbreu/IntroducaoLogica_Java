package exerciciosLaçodeRepetição;

import java.util.Scanner;

public class For_exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, i;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if(n1 < n2) {
			for (i = n1; i <= n2; i++) 
			{	
				if(i%3 == 0 && i%5== 0){
					System.out.println("\nNo intervalo entre "+n1+" e "+n2+": \n"+i+" é múltiplo de 3 e 5");
				}	
			}	
		}		
		else {
			System.out.println("\nIntervalo inválido!");
		}
	}
}
