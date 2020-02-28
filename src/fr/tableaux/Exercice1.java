package fr.tableaux;

public class Exercice1 {
	
	public static void main(String[] args) {
		
		// Déclarer un tableau d’entiers contenant tous les entiers de 1 à 10
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
				
		// Afficher la longueur du tableau en utilisant la propriété length
		System.out.println("Longueur du tableau : " + tab.length);
				
		// Afficher le premier élément du tableau
		System.out.println("Premier élément du tableau : " + tab[0]);
				
		// Afficher le dernier élément du tableau en utilisant la propriété length
		System.out.println("Dernier élément du tableau : " + tab[(tab.length - 1)]);
				
		// L'entier 5 est à l'index 4
				
		// Afficher l’élement d’index 10. 
		// System.out.println(tab[10]);
				
		// L'affichage de l'élément d'index 10 provoque ce qu'on appelle une exception : java.lang.ArrayIndexOutOfBoundsException
		// Pour un tableau de longueur 10, le dernier élément affichable est l'élément d'index 9.


		// Modifier la valeur de l’élément d’index 4 et donner lui la valeur 8.
		tab[4] = 8;
		
	}

}
