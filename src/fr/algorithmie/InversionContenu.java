package fr.algorithmie;

public class InversionContenu {
	
	public static void main(String[] args) {
		
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		 int[] arrayCopy = new int[array.length];
		 int j = 0;
		 
		 
		 for (int i = array.length - 1; i >= 0; i--) {
			 
			 arrayCopy[j] = array[i];
			 j++;
			 
		}
		
		 for (int i = 0; i < array.length; i++) {
				
				System.out.println("Array Indice " + i + " = " + array[i]);
				
		}
		 
		 for (int i = 0; i < arrayCopy.length; i++) {
				
				System.out.println("ArrayCopy Indice " + i + " = " + arrayCopy[i]);
			
		}
		
	}

}
