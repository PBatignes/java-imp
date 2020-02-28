package fr.operateurs.logique;

public class CalculLogique {
	
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		System.out.println("a OU b = " + (a || b) + "\n" + // true
				"a OU c = " + (a || c) + "\n" + // true
				"a ET b = " + (a && b) + "\n" + // false
				"a ET c = " + (a && c)); // false
	}

}
