
public class Main {
	
	// In Java gibt es drei Variablen Typen: Lokale-, Klassen- und Instanz (Objekt)-Variablen.
	// Mit Variablen werden Daten im Hauptspeicher / Arbeitsspeicher gespeichert
	// Auf diese Daten kann man dann zur Programmlaufzeit zugreifen / nutzen
	
	public static void main(String[] args) {
		int summe = 100;
		
		for (int i = 0; i < 10; i++) {
			int j = i + 1;
			System.out.println(j);
		}
		errechne();
		
		
		KlasseOne aKlasseOne = new KlasseOne();
		aKlasseOne.a = 100;
		
		System.out.println(KlasseOne.b);
		
	}
	
	public static void errechne() {
		int zahl = 50;  // Lokale Variablen d.h. diese sind nur innerhalb des Blockes 
						//{  } sichtbar und nach dem beenden der Funktion werden diese gelöscht 
		int zahl1 = 50;
		
		System.out.println("Summe: " + (zahl + zahl1));
	}

}
