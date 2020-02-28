package fr.declaration.variable;

class DeclarationApp{

	public static void main (String[] args) {
		byte b = 10;
		short s = 100;
		int i = 10_000;
		long l = 1_000_000_000;
		float f = 3.14158f;
		double d = 7862145.21475;
		char c = 'e';
		boolean bool = true;
		
		System.out.println("Byte : " + b + "\n" +
				"Short : " + s + "\n" +
				"Int : " + i + "\n" +
				"Long : " + l + "\n" +
				"Float : " + f + "\n" +
				"Double : " + d + "\n" +
				"Char : " + c + "\n" +
				"Bool : " + bool + "\n");
	}
}