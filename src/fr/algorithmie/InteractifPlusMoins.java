package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {

		int secretNb = new Random().nextInt(100)+1;
		Scanner saisie = new Scanner(System.in);
		int nb, nCoup = 0;
		
		do {
			
			System.out.println("Entrez un nombre entre 1 et 100 : ");
			nb = saisie.nextInt();
			
			if (nb > secretNb) {
				
				System.out.println("Moins");
				
			} else if (nb < secretNb){
				
				System.out.println("Plus");
				
			}
			
			nCoup += 1;
			
		} while (nb != secretNb);
		
		System.out.println("Bravo, vous avez trouvé en " + nCoup + " coups");

	}

}
