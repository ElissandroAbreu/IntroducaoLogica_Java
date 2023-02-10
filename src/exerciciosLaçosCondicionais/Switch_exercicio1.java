package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class Switch_exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int cd,quant;
		float total;
		
		System.out.println("\nLanchonete Sucesso´s");
		System.out.println("\nCodigo 1 - Cachorro Quente - R$10,00");
		System.out.println("\nCodigo 2 - X-Salada - R$15,00");
		System.out.println("\nCodigo 3 - X-Bacon - R$18,00");
		System.out.println("\nCodigo 4 - Bauru - R$12,00");
		System.out.println("\nCodigo 5 - Refrigerante - R$8,00");
		System.out.println("\nCodigo 6 - Suco de Laranja - R$13,00");
		System.out.println("\nDigite o código do produto: ");
		cd = leia.nextInt();
		System.out.println("\nDigite a quantidade de produtos: ");
		quant = leia.nextInt();
		
		switch(cd) {
		case 1:
			total = quant *10;
			System.out.println("\nProduto: Cachorro Quente - Valor a pagar: "+total);
		break;
		case 2:
			total = quant *15;
			System.out.println("\nProduto: X-Salada - Valor a pagar: "+total);
			break;
		case 3:
			total = quant *18;
			System.out.println("\nProduto: X-Bacon - Valor a pagar: "+total);
			break;
		case 4:
			total = quant *12;
			System.out.println("\nProduto: Bauru - Valor a pagar: "+total);
			break;
		case 5:
			total = quant *8;
			System.out.println("\nProduto: Refrigerante - Valor a pagar: "+total);
			break;
		case 6:
			total = quant *13;
			System.out.println("\nProduto: Suco de laranja - Valor a pagar: "+total);
			break;
			default:
				System.out.println("\nOpção Inválida");
		}
		
		
			
		

	}

}
