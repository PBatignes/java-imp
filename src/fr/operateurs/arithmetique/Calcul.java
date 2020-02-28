package fr.operateurs.arithmetique;

public class Calcul {
	
public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		
		System.out.println("a + b = " + (a + b) + "\n" +
				"a * b = " + (a * b) + "\n" + 
				"a - b = " + (a - b) + "\n" +
				"a / b = " + (a / b) + "\n" + // le résultat est arrondi
				"a mod b = " + (a % b) + "\n");
	}

}
