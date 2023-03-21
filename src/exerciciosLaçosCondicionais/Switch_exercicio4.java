package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class Switch_exercicio4 {

	public static void main(String[] args) {
		
		float saldo = 1000;
		float saldoSaque, novoSaldo, valorDeposito, saque, deposito;
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Código Operação  |      Operação");
		System.out.println("------------------------------");
		System.out.println("       1         |       Saldo");
		System.out.println("       2         |       Saque");
		System.out.println("       3         |       Depósito");
		
		System.out.println("Operação: ");
		opcao = leia.nextInt();
		
		
		switch(opcao) {
		case 1:
			System.out.println("Operação Saldo\n");
			System.out.println("Saldo: " + saldo);
			
			break;
			
		case 2:
			System.out.println("Valor: ");
			saque = leia.nextFloat();
			
			if (saque < saldo) {
				
				saldoSaque = saldo - saque;
				
				System.out.println("Operação Saque\n");
				System.out.println("Valor: " + saldoSaque);
				
			}else {
				System.out.println("Saldo Insuficiente");
			}
			
			break;
			
		case 3:
			System.out.println("Valor: ");
			deposito = leia.nextFloat();
			
			novoSaldo = saldo + deposito;
			
			System.out.println("Operação Depósito\n");
			System.out.println("Valor: " + novoSaldo);
			
			break;
		
		default:
			System.out.println("Operação Inválida!");
		
		}
			
	}

}
