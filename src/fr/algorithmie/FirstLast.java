package fr.algorithmie;

public class FirstLast {
	
	public static void main(String[] args) {
		
		int[] array = {4,3,6,1,4};
		boolean bool;
		
		if (array.length > 1 || (array[0] == array[array.length - 1])) {
			
			bool = true;
			
		} else {
			
			bool = false;
			
		}
		
		System.out.println(bool);

		
	}

}
