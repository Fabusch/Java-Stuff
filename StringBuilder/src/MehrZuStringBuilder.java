
public class MehrZuStringBuilder {
	
	public static void main(String[] args) {
		
		// Datentyp (Klasse) StringBuilder
		
		
		StringBuilder stringBuilder = new StringBuilder("Hallo"); // Wie StringBuffer nur erst ab der Version 5 
		StringBuilder stringBuilder2 = new StringBuilder(10);
		System.out.println(stringBuilder2);
		
		
		stringBuilder2.append("Hi...");
		System.out.println(stringBuilder2);
		
		stringBuilder2.insert(5, '!');
		System.out.println(stringBuilder2);
		
	}

}
