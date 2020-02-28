package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez un nombre : ");
		int nb = saisie.nextInt();
		int som = 0;
		
		for (int i = 1; i <= nb; i++) {
			
			som += i;
			
		}
		
		System.out.println(som);

	}

}
