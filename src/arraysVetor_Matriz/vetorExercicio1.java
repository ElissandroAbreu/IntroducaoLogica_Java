package arraysVetor_Matriz;

import java.util.Scanner;

public class vetorExercicio1 {

	public static void main(String[] args) {
		
		int vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int valor, x, aux = -1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que deseja encontrar: ");
		valor = leia.nextInt();
		
		for(x = 0; x < 10; x++) {
			if(valor == vetorInteiros[x]) {
				aux = x;
			}
		}
		if (aux!= -1) {
			System.out.println("\nO número "+valor+" está localizado na posição "+aux);
		}
		else {
			System.out.println("\nO número "+valor+" não foi encontrado");
		}
		
	}
}
