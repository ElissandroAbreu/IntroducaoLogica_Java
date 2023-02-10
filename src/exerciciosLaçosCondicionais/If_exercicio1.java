package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class If_exercicio1 {

	public static void main(String[] args) {
		
		int a,b,c,soma;
		

		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o valor de A: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o valor de B: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o valor de C: ");
		c = leia.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println("\n"+a+"+"+b+"="+soma+">"+c);
			System.out.println("\nA Soma de A + B é Maior do que C ");
		}
		else if(soma < c) {
			System.out.println("\n"+a+"+"+b+"="+soma+"<"+c);
			System.out.println("\nA Soma de A + B é Menor do que C ");	
		}
		else {
			System.out.println("\n"+a+"+"+b+"="+soma+"="+c);
			System.out.println("\nA Soma de A + B é Igual a C ");
			
		}
		
	}

}
