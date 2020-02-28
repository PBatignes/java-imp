package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		//affiche que les entiers supérieurs à 3
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > 3) {
				
				System.out.println("Array Indice > 3 : " + array[i]);
			
			}
			
		}
		
		//affiche que les entiers pairs
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				
				System.out.println("Array Indice pairs : " + array[i]);
			
			}
			
		}
		
		//affiche que les valeurs correspondant aux index pairs
		for (int i = 0; i < array.length; i++) {
			
			if (i % 2 == 0) {
				
				System.out.println("Array Indice Ipairs : " + array[i]);
			
			}
			
		}
		
		//affiche que les entiers impairs
		for (int i = 0; i < array.length; i++) {
					
			if (array[i] % 2 != 0) {
						
				System.out.println("Array Indice impairs : " + array[i]);
					
			}
					
		}

	}

}
