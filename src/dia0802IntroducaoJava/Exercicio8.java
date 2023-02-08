package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		double cf, pd, i, cc;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o Custo de Fábrica: ");
		cf = leia.nextFloat();
		
		pd = cf * 0.28;
		i = cf * 0.45;
		cc = cf + pd + i;
		
		System.out.println("\nO custo de um carro ao consumidor é: "+cc);
		
		
		
	}

}
