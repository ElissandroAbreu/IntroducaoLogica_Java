package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class Switch_exercicio3 {

	public static void main(String[] args) {
		
		float n1, n2, total;
		int codop;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n|   Código    |    Operação      |");
		System.out.println("\n|      1      |    Soma          |");
		System.out.println("\n|      2      |    Subtração     |");
		System.out.println("\n|      3      |    Multiplicação |");
		System.out.println("\n|      4      |    Divisão       |");
		System.out.println("\nDigite o 1° número: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite o 2° número: ");
		n2 = leia.nextFloat();
		System.out.println("\nEscolha a operação: ");
		codop = leia.nextInt();
		
		switch(codop) {
		case 1:
			total = n1 + n2;
			System.out.println(n1+" + "+n2+" = "+total);
			break;
		case 2:
			total = n1 - n2;
			System.out.println(n1+" - "+n2+" = "+total);
			break;
		case 3:
			total = n1 * n2;
			System.out.println(n1+" * "+n2+" = "+total);
			break;
		case 4:
			total = n1 / n2;
			System.out.println(n1+" / "+n2+" = "+total);
			break;
		default:
			System.out.println("\nOperação Inválida");	
		}
	}
}
