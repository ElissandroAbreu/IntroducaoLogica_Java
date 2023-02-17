package POO;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class estruturaDeDados_Fila {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		Queue<String> fila = new LinkedList<String>();
		
		do {
			System.out.println("\n*****************************************************");
			System.out.println("\n\t\t(1) - Adicionar Cliente na Fila");
			System.out.println("\n\t\t(2) - Listar todos os Clientes");
			System.out.println("\n\t\t(3) - Retirar Cliente da Fila");
			System.out.println("\n\t\t(0) - Sair");
			System.out.println("\n*****************************************************");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Digite o nome: ");
				String nomeCliente = leia.nextLine();
				fila.add(nomeCliente);
				System.out.println("Fila: "+fila+"\nCliente Adicionado(a)");
			break;
			
			case 2:
				System.out.println("\nLista de Cliente na fila:\n"+fila);
			break;
			
			case 3:
				if(fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				}
				else {
					fila.poll();
					System.out.println("Fila: "+fila+"\nCliente foi Chamado(a)");
				}
			break;
				
			case 0:
				System.out.println("Programa Finalizado!");
			}
		} while(op != 0);
	}
}
