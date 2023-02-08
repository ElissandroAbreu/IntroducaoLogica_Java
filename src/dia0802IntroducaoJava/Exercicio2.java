package dia0802IntroducaoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		 int totaldias, anos, meses, dias;
		 
		 Scanner leia = new Scanner(System.in);
			
		 System.out.println("\nQual sua idade em dias?: ");
		 totaldias = leia.nextInt();
		 
		 anos = totaldias/ 365; 
		 meses = (totaldias % 365)/ 30;
		 dias = (totaldias % 365) % 30;
		 
		 System.out.println("\nSua idade: "+anos+" ano(s), "+meses+" mes(es), "+dias+" dia(s).");
		 

	}

}
