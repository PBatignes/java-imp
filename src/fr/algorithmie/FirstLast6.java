package fr.algorithmie;

public class FirstLast6 {

	public static void main(String[] args) {
		
		int[] array = {6, 5, 6, 4, 12, 489, 41, 6};
		boolean bool;
		
		if (array.length >= 1 || (array[0] == 6 && array[array.length - 1] == 6)) {
			
			bool = true;
			
		} else {
			
			bool = false;
			
		}
		
		System.out.println(bool);

	}

}
