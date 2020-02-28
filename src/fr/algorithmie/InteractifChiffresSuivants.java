package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {

	public static void main(String[] args) {

		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Entrez un nombre : ");
		int nb = saisie.nextInt();
		
		for (int i = nb + 1; i <= nb + 10; i++) {
			
			System.out.println(i + "\n");
			
		}

	}

}
