package fr.tableaux;

public class Exercice2 {
	
	public static void main(String[] args) {
		
		// Déclarer un tableau de dimensions 2 avec une ligne contenant 3 nombres et une seconde ligne 
		//contenant 5 nombres
		int[][] tab = {{7,5,2}, {3,9,10,4,8}};
				
		// Afficher la longueur du tableau en utilisant la propriété .length.
		System.out.println("Longueur du tableau : " + tab.length);
				
		// Afficher la longueur de la première ligne en utilisant la propriété .length
		System.out.println("Longueur de la première ligne : " + tab[0].length);
				
		// Afficher la longueur de la seconde ligne en utilisant la propriété .length
		System.out.println("Longueur de la dernière ligne : " + tab[tab.length-1].length);
				
		// Afficher le premier élément du tableau
		System.out.println("Premier élément du tableau : " + tab[0][0]);
				
		// Afficher le dernier élément du tableau
		System.out.println("Dernier élément du tableau : " + tab[tab.length-1][tab[tab.length-1].length-1]);
		
	}

}
