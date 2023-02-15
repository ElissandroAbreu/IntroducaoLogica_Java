package exerciciosLaçosCondicionais;

import java.util.Scanner;

public class If_exercicio4 {

	public static void main(String[] args) {
		
		String p1, p2, p3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva a 1ª carcterística: ");
		p1 = leia.next();
		System.out.println("\nEscreva a 2ª característica: ");
		p2 = leia.next();
		System.out.println("\nEscreva a 3ª característica: ");
		p3 = leia.next();
		
		
		if(p1.equals("vertebrado")) {
			if(p2.equals("ave")) {
				if(p3.equals("carnívoro")) {
					System.out.println("Águia");
				}
				else {
					System.out.println("Pomba");
				}
			}
			else if (p2.equals("mamífero")) {
				if(p3.equals("onívoro")) {
					System.out.println("Homem");
				}
				else {
					System.out.println("Vaca");
				}
			}	
		}
		else if(p1.equals("invertebrado")) {
			if(p2.equals("inseto")) {
				if(p3.equals("hematófago")) {
					System.out.println("Pulga");
				}
				else {
					System.out.println("Lagarta");
				}
			}
			else if(p2.equals("anelídio")) {
				if(p3.equals("hematófago")) {
					System.out.println("Sanguessuga");
				}
				else {
					System.out.println("Minhoca");
				}
			}
		}
	}

}
