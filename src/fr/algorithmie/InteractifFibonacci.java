package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		
		Scanner saisie = new Scanner(System.in);
		
		System.out.println("Choisissez un rang de la suite de Fibonacci :\n");
		System.out.println(fibonacci(saisie.nextInt()));;

	}
	
	public static int fibonacci(int nb) {
		
		if (nb == 0) {
			
			return 0;
			
		} else if (nb == 1) {
			
			return 1;
			
		} else {
			
			return fibonacci(nb - 1) + fibonacci(nb - 2);
			
		}
		
	}

}
