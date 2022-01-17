
public class MehrZuString {

	// Ein String ist eine Zeichenkette
	// Eine Zeichenkette ist dabei nichts anderes als ein Array von einzelnen Zeichen, Datentyp char. 
	
	
	public static void main(String[] args) {
		
		String string = "Hallo"; // Nennt man auch erstellen durch einen String Literal
		String string2 = new String("Hi");
		
		// Methoden der Klasse String
		String passwort = "123456";
		String eingabeUser = "123456";
		
		if (passwort.equals("passwort")) {
			System.out.println("Login erfolgreich");
		} else {
			System.out.println("Falsches Passwort");
		}
		
		System.out.println(passwort.length());
		
		String test = "Hallo ich bin der Olli";
		String name = "Olli";
		int namePostion = test.indexOf(name);
		System.out.println(namePostion);
		
		
		String passwortUser = "halloICHBinDa";
		String passWortUserEingabe = "halloichbinda";
		//passwortUser.toUpperCase();
		
		if (passwortUser.toLowerCase().equals(passWortUserEingabe)) {
			System.out.println("Login Erfolgreich");
		} else {
			System.out.println("Passwort falsch");
		}
		
		String string1 = "Hallo,Peter,du,bist,super";
		System.out.println(string1);
		String string3 = string1.replace(',', ' ') ;
		System.out.println(string3);
		
		
		// MERKE: String erzeugt oder verändert -> Es wird immer ein neuer String erstellt, weil Strings immutable(unveräderbar) sind 
		// MERKE: StringBuffer erzeugt oder verändert -> Es ist immer das selbe Objekt 
		
		String username = "peter123";
		username = "user123";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
