package exercicios_extrasLaçosdeRepetição;

import java.util.Scanner;

public class FOR_exercicio1 {

	public static void main(String[] args) {
		
		int i;
		
		Scanner leia = new Scanner(System.in);
		
		for(i= 1000; i <= 1999; i++)
		{
			if(i % 11 == 5) {
				System.out.println("\nNúmeros no intervalo entre 1000 e 1999 em que divididos por 11 e tenham resto  = 5: "+i);
				
			}	
		}
	}

}
