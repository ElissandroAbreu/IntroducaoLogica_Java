package exercicios_extrasLaçosdeRepetição;

import java.util.Scanner;

public class FOR_exercicio2 {

	public static void main(String[] args) {
		
		int i, n, cont_par = 0, cont_impar = 0; 
		
		Scanner leia = new Scanner(System.in);
		
		for(i = 1; i < 11 ; i++){
			System.out.println("\nDigite um numero: ");
			n = leia.nextInt();
					
			if(n % 2  == 0) {
				cont_par++;
			}
			else if (n % 2 == 1) {
				cont_impar++;	
			}
		}
		System.out.println("\nTOTAL\nPar: "+cont_par+"\nÍmpar: "+cont_impar);
		
		
		
		
		
		

	}

}
