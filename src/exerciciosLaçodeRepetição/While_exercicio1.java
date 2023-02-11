package exerciciosLaçodeRepetição;

import java.util.Scanner;

public class While_exercicio1 {

	public static void main(String[] args) {
		
		int idade, id_maior = 0, id_menor = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {
			
			if (idade < 21) {
				id_menor++;
			}
			if (idade > 50) {
				id_maior++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = leia.nextInt();	
		}
		System.out.println("\nTotal de pessoa menores de 21 anos: "+id_menor);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+id_maior);
	}

}
