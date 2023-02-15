package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class Switch_exercicio4 {

	public static void main(String[] args) {
		
		int codop;
		float saldo = 1000 , novosaldo, novosaldo2 , saque, deposito;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nOperação: ");
		codop = leia.nextInt();
		
		switch(codop) {
		case 1:
			System.out.println("\nOperação Saldo\nSaldo: "+saldo);
			break;
			
		case 2:
			System.out.println("\nValor: ");
			saque = leia.nextFloat();
			
			novosaldo = saldo - saque;
			
			if(saque <= saldo) {
				System.out.println("Operação Saque\nNovo Saldo: "+novosaldo);
			}
			else {
				System.out.println("Saldo Insuficiente");
			}
			break;
		case 3:
			System.out.println("\nValor: ");
			deposito = leia.nextFloat();
			
			novosaldo2 =  + deposito;
			
			System.out.println("\nOperação Depósito\nNovo Saldo: "+novosaldo2);
			break;
			
		default:
			System.out.println("\nOperação Inválida");
			
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		

		

	}

}
