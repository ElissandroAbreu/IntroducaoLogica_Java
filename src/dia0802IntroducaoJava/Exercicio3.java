package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int totalseg, horas, min, seg;
		 
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\nQual a duração do eventos em segundos?: ");
		totalseg = leia.nextInt();
		
		horas = totalseg/ 3600; 
		min = (totalseg % 3600)/ 60;
		seg = (totalseg % 3600) % 60;
		
		System.out.println("\nO evento durou: "+horas+" horas, "+min+" minutos, "+seg+" segundos.");

	}

}
