package fr.tableaux;

public class Exercice1 {
	
	public static void main(String[] args) {
		
		// D�clarer un tableau d�entiers contenant tous les entiers de 1 � 10
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
				
		// Afficher la longueur du tableau en utilisant la propri�t� length
		System.out.println("Longueur du tableau : " + tab.length);
				
		// Afficher le premier �l�ment du tableau
		System.out.println("Premier �l�ment du tableau : " + tab[0]);
				
		// Afficher le dernier �l�ment du tableau en utilisant la propri�t� length
		System.out.println("Dernier �l�ment du tableau : " + tab[(tab.length - 1)]);
				
		// L'entier 5 est � l'index 4
				
		// Afficher l��lement d�index 10. 
		// System.out.println(tab[10]);
				
		// L'affichage de l'�l�ment d'index 10 provoque ce qu'on appelle une exception : java.lang.ArrayIndexOutOfBoundsException
		// Pour un tableau de longueur 10, le dernier �l�ment affichable est l'�l�ment d'index 9.


		// Modifier la valeur de l��l�ment d�index 4 et donner lui la valeur 8.
		tab[4] = 8;
		
	}

}
