
public class MehrZuString {

	
	public static void main(String[] args) {
		
		// Der Datentyp String wird in Java am meisten verwendet
		// Mit dem Datentyp String können Zeichenketten in Variablen gespeichert werden
		
		
		// Strings erstellen
		String zeichenkette1 = new String("Zeichenkette1"); // Erstellen durch den new Konstruktor
		String zeichenkette2 = "Zeichenkette2"; // Nennt man auch erstellen durch einen String Literal
		

		// Eine Zeichenkette ist dabei nichts anderes als ein Array von einzelnen Zeichen, Datentyp char. 
		
		// Methoden der Klasse String
		
		String passwort = "hallo"; 
		String passwortEingabe = "HALLO";
		
		if (passwort.equals(passwortEingabe)) {
			System.out.println("Login erfolgreich");
		} else {
			System.out.println("Falsches Passwort");
		}
		
		System.out.println(passwort.length()); // Achtung wie beim Array Länge - 1 = Index 
		
		String test = "Hallo ich bin der Olli";
		String name = "Olli";
		int namePosition = test.indexOf(name);
		System.out.println(namePosition); // An welcher Stelle befindet sich der Olli ACHTUGN hier wird wieder angefangen von 0 zu zählen
		
		String subString = zeichenkette1.substring(0, 4);
		System.out.println(subString);
		
		// toUpperCase / toLowerCase -> Hilfreich wenn Groß/Klein egal ist 
		String passwortUser = "halloICHBinDa";
		String passWortUserEingabe = "halloichbinda";
		//passwortUser.toUpperCase();
		
		if (passwortUser.toLowerCase().equals(passWortUserEingabe)) {
			System.out.println("Login erfolgreich");
		} else {
			System.out.println("Falsches Passwort");
		}
		
		
		
		// Alle diese Methoden haben ein Problem bzw. Gemeinsamkeit:
		// Alle liefern immer wieder einen neuen String 
		// Strings sind immutable und somit unveräderbar!!!
		
		// Egal wie du einen String veränderst, es wird dir immer ein neuer String zurückgegeben -> Beim vielen arbeiten mit Strings, kann es zu performance Einbußen kommen
		
		// Weiter Methode der Klasse String:
		// replace()
		// substring()
		
		String string = "Hallo,Peter,du,bist,super";
		System.out.println(string);
		System.out.println(string.replace(',', ' '));
		
		// Auch beim überschreiben eines Strings wird im Hintergrund einer neuer String erstellt -> Das kostet Rechenzeit 
		
		String username = "user123"; // String Objekt erzeugt
		System.out.println(username);
		
		username = "user234"; // Auch beim überschreiben wird im Hintergrund ein neues String Objekt erzeugt -> Schlechte Performance 
		System.out.println(username);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
