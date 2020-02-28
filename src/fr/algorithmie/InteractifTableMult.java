package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		int nb;
		
		do {
			
			System.out.println("Entrez un nombre entre 1 et 10 : ");
			nb = saisie.nextInt();
		
		} while (nb <1 || nb > 10);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println(nb + " * " + i + " = " + (nb * i) + "\n");
			
		}

	}

}
