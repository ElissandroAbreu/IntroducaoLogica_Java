package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int A, B, C;
		double D, R, S;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A: ");
		A = leia.nextInt();
		System.out.println("\nEntre com o número B: ");
		B = leia.nextInt();
		System.out.println("\nEntre com o número C: ");
		C = leia.nextInt();
		
		R = Math.sqrt(A+B);
		S = Math.sqrt(B+C);
		D = R+S/ 2;
		
		System.out.println("\nO resultado da expressão D= R+S/2, onde R=(A+B)² e S=(B+C)² é: "+D);
		
		

	}

}
