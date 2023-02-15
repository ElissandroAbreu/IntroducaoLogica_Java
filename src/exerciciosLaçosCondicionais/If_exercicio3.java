package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class If_exercicio3 {

	public static void main(String[] args) {
		
		String doador;
		int idade;
		boolean resposta;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu nome: ");
		doador = leia.nextLine();
		System.out.println("\nDigite a idade: ");
		idade = leia.nextInt();
		System.out.println("\nPrimeira doação de sangue? ");
		resposta = leia.nextBoolean();
		
		if(idade >= 18 && idade <= 69) {
			if(idade >= 60 && idade <= 69) {
				if (resposta == true) {
					System.out.println(doador+" não está apto para doar sangue!");
				}
				else {
					System.out.println(doador+" está apto pra doar sangue!");
				}
			}
			else {
				System.out.println(doador+" está apto pra doar sangue!");			
			}
		}
		else {
			System.out.println(doador+" não está apto pra doar sangue!");
		}
	
		
		
		
		
		
		
		
		
		

	}

}
