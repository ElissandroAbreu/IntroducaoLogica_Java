package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		double x1,x2, y1, y2, D, p1, p2;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor x1: ");
		x1 = leia.nextDouble();
		System.out.println("\nEntre com o valor x2: ");
		x2 = leia.nextDouble();
		System.out.println("\nEntre com o valor y1: ");
		y1 = leia.nextDouble();
		System.out.println("\nEntre com o valor x2: ");
		y2 = leia.nextDouble();
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		
		D = Math.sqrt(p1 + p2);
		
		System.out.printf("\nResultado da fórmula: %.2f ",D);

	}

}
   