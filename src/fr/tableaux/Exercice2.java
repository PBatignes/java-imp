package fr.tableaux;

public class Exercice2 {
	
	public static void main(String[] args) {
		
		// D�clarer un tableau de dimensions 2 avec une ligne contenant 3 nombres et une seconde ligne 
		//contenant 5 nombres
		int[][] tab = {{7,5,2}, {3,9,10,4,8}};
				
		// Afficher la longueur du tableau en utilisant la propri�t� .length.
		System.out.println("Longueur du tableau : " + tab.length);
				
		// Afficher la longueur de la premi�re ligne en utilisant la propri�t� .length
		System.out.println("Longueur de la premi�re ligne : " + tab[0].length);
				
		// Afficher la longueur de la seconde ligne en utilisant la propri�t� .length
		System.out.println("Longueur de la derni�re ligne : " + tab[tab.length-1].length);
				
		// Afficher le premier �l�ment du tableau
		System.out.println("Premier �l�ment du tableau : " + tab[0][0]);
				
		// Afficher le dernier �l�ment du tableau
		System.out.println("Dernier �l�ment du tableau : " + tab[tab.length-1][tab[tab.length-1].length-1]);
		
	}

}
