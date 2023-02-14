package exercicios_extrasLaçosdeRepetição;

import java.util.Scanner;

public class WHILE_exercicio3 {

	public static void main(String[] args) {
		
		int idade, id_menos = 0, id_mais = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				id_menos++;
			}
			if (idade > 50) {
				id_mais++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();	
		}
		System.out.println("\nTotal pessoas com menos de 21 anos: "+id_menos);
		System.out.println("\nTotal pessoas com mais de 50 anos: "+id_mais);
	}
}
