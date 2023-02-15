package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class Switch_exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int codcargo;
		float salario; 
		double novosalario;
		
		System.out.println("\nNome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("\nCódigo do cargo: ");
		codcargo = leia.nextInt();
		System.out.println("\nSalario: ");
		salario = leia.nextFloat();
		
		switch(codcargo) {
		case 1:
			novosalario = salario + (0.1 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Gerente, salário: "+novosalario);
		break;
		case 2:
			novosalario = salario + (0.07 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Vendedor, salário: "+novosalario);
		break;
		case 3:
			novosalario = salario + (0.09 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Supervisor, salário: "+novosalario);
		break;
		case 4:
			novosalario = salario + (0.06 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Motorista, salário: "+novosalario);
		break;
		case 5:
			novosalario = salario + (0.05 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Estoquista, salário: "+novosalario);
		break;
		case 6:
			novosalario = salario + (0.08 * salario);
			System.out.println("\nNome do colaborador: "+nome+", cargo: Técnico de TI, salário: "+novosalario);
		break;
		default:
			System.out.println("\nOpção Inválida");
		}
	}

}
