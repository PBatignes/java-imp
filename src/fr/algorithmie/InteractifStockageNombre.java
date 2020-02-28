package fr.algorithmie;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner saisie = new Scanner(System.in);
		List<Integer> array = new ArrayList<Integer>();
		int nbMenu;
		
		do {
		
			System.out.println("\nChoisissez un menu : \n" +
								"1 : Entrer un nombre \n" +
								"2 : Voir le tableau \n" +
								"-1 : Quiter \n");
			
			nbMenu = saisie.nextInt();
			
			switch (nbMenu) {
			
			case (1) :
				System.out.println("\nEntrez un nombre : ");
				int nb = saisie.nextInt();
				array.add(nb);
				break;
			
			case (2) :
				System.out.println("\nTous les nombre enregistrés : ");
				for (ListIterator<Integer> it = array.listIterator(); it.hasNext(); ) {
					int a = it.next();
					System.out.println(a);
				}
				break;
			default :
				System.out.println("\nCe menu n'existe pas");
			}
			
		} while (nbMenu != -1);
			

	}

}
