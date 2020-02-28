package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez un nombre : ");
		int max = saisie.nextInt();;
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println("Entrez un nombre : ");
			int nb = saisie.nextInt();
			if (max < nb) {
				
				max = nb;
				
			}
			
		}
		
		System.out.println(max);

	}

}
