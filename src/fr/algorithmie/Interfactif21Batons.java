package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		
		//Randomly selects the player who starts ...
		int rdm = new Random().nextInt(100)+1;
		Scanner saisie = new Scanner(System.in);
		int baton = 21;
		
		//If the number is even the human player starts ...
		if (rdm % 2 == 0) {
			
			System.out.println("C'est le joueur qui commence \n");
			joueur(baton);
			
		//If the number is uneven the computer starts.
		} else {
			
			System.out.println("C'est l'ordinateur qui commence \n");
			ordinateur(baton, null);
			
		}

	}
	
	//Function to control the player action
	public static void joueur(int baton) {
		
		
		System.out.println("Combien de bâtons prenez-vous ?\n");
		Scanner jSaisie = new Scanner(System.in);
		int batonPris;
		
		/**Loop in continue as long as the player does not enter a number who is 
		*strictly bigger than 0, strictly lower than 4 and less than the remaining number of 
		*sticks.
		*The player number can be equal to the remaining number of sticks if that number is lower
		*or equal to 3.
		*/
		do {
			
			batonPris = jSaisie.nextInt();

		} while (batonPris < 1 || batonPris > 3 || batonPris > baton);
		
		
		if (baton - batonPris > 0) {
			
			System.out.println("Le joueur à pris " + batonPris + " bâtons\n");
			System.out.println("Il reste " + (baton - batonPris) + " bâtons\n\n");
			ordinateur(baton - batonPris, batonPris);
			
		} else {
			
			System.out.println("Il reste " + (baton - batonPris) + " bâtons\n");
			System.out.println("Vous avez Perdus");
			
		}
		
	}

	//Function to control the computer action
	private static void ordinateur(int baton, Integer batonPris) {
		
		/**If the computer start the game randomize his choice.
		 * The OR is here to make sure that the computer does not win if the player start.
		 */
		if (batonPris == null || (baton % 4) - 1 != 0) {
			
			int rdm = new Random().nextInt(3)+1;
			System.out.println("L'ordinateur à pris " + rdm + " bâtons\n");
			System.out.println("Il reste " + (baton - rdm) + " bâtons\n\n");
			joueur(baton - rdm);
			
		} else {
			
			/**If there is 5 or more stick remaining the computer will base his move with the 
			 * player's
			 */
			if (baton > 4) {
				
				switch (batonPris) {
				
				case (1) :
					System.out.println("L'ordinateur à pris 3 bâtons\n");
					System.out.println("Il reste " + (baton - 3) + " bâtons\n\n");
					joueur(baton - 3);
					break;
				case (2) :
					System.out.println("L'ordinateur à pris 2 bâtons\n");
					System.out.println("Il reste " + (baton - 2) + " bâtons\n\n");
					joueur(baton - 2);
					break;
				case (3) :
					System.out.println("L'ordinateur à pris 1 bâtons\n");
					System.out.println("Il reste " + (baton - 1) + " bâtons\n\n");
					joueur(baton - 1);
					break;
				
				}
				
			} else {
				
				//In case there is only 4 sticks remaining the computer will either win ...
				switch (baton) {
				
				case (4) :
					System.out.println("L'ordinateur à pris 3 bâtons\n");
					System.out.println("Il reste " + (baton - 3) + " bâtons\n\n");
					joueur(baton - 3);
					break;
				case (3) :
					System.out.println("L'ordinateur à pris 2 bâtons\n");
					System.out.println("Il reste " + (baton - 2) + " bâtons\n\n");
					joueur(baton - 2);
					break;
				case (2) :
					System.out.println("L'ordinateur à pris 1 bâtons\n");
					System.out.println("Il reste " + (baton - 1) + " bâtons\n\n");
					joueur(baton - 1);
					break;
				case (1) : //Or lose.
					System.out.println("L'ordinateur à pris 1 bâtons\n");
					System.out.println("Il reste " + (baton - 1) + " bâtons\n\n");
					System.out.println("L'ordinateur à perdu\n");
					break;
					
				}
				
			}
			
		}
		
	}

}
