package POO;

import java.util.Scanner;
import java.util.Stack;

public class estruturaDeDados_Pilha {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		do {
			System.out.println("\n*****************************************************");
			System.out.println("\n\t\t(1) - Adicionar Livro na Pilha");
			System.out.println("\n\t\t(2) - Listar todos os Livros");
			System.out.println("\n\t\t(3) - Retirar Livro da pilha");
			System.out.println("\n\t\t(0) - Sair");
			System.out.println("\n*****************************************************");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Digite o nome: ");
				String nomeLivro = leia.nextLine();
				pilha.push(nomeLivro);
				System.out.println("Pilha: "+pilha+"\nLivro Adicionado");
			break;
			
			case 2:
				System.out.println("\nLista de Livros na pilha:\n"+pilha);
			break;
			
			case 3:
				if(pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				}
				else {
					pilha.pop();
					System.out.println("Pilha: "+pilha+"\nUm Livro foi retirado da Pilha");
				}
			break;
				
			case 0:
				System.out.println("Programa Finalizado!");
			}
		} while(op != 0);
	}
}
