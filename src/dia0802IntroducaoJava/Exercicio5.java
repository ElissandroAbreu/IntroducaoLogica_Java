package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		float nota1,nota2,nota3,media;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media= (nota1 * 2) + (nota2 * 3)+ (nota3 * 5)/ 10;
		
		System.out.println("\nMédia ponderada: "+media);

	}

}
