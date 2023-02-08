package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int idade, meses, dias, totaldias;
		
		Scanner	 leia = new Scanner(System.in);
		
		System.out.println("\nQual sua idade em anos?: ");
		idade = leia.nextInt();
		System.out.println("\nE os meses?: ");
		meses = leia.nextInt();
		System.out.println("\nE os dias?: ");
		dias = leia.nextInt();
		
		totaldias = (idade * 365) + (meses * 30) + dias;
		
		System.out.println("\nSua idade em dias é: "+totaldias);
		
		//fazer raiz quadrada Math.sqrl (Math.sqrt(2);) e potencial Math.pow (a confirmar)

	}

}
