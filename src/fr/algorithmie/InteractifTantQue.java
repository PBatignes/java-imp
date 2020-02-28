package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		int nb;
		
		do {
			
			System.out.println("Entrez un nombre entre 1 et 10 : ");
			nb = saisie.nextInt();
		
		} while (nb <1 || nb > 10);

	}

}
