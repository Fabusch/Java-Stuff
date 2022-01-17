
public class MethodenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator Rückgabedatentyp Methodenname ( Datentyp Paramter1,
		// Datentyp Paramter2 )>
		// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public,
		// private und protected

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe

		// //for(Anfangswert; Abbruchbedingung; Zähler)
		// for(int i = 1; i <= 10; i++){
		// erstelleGegner();
		// }
		
		erstelleGegner("Peter", 100);
		erstelleGegner("Olaf", 80);

	}

	// void = leer
	// return = Rückgabe

	// public static void erstelleGegner(){
	// String gegnerName = "Olaf";
	// int gegnerLeben = 100;
	// System.out.println("Gegner wurde erstellt");
	// }

	public static void erstelleGegner(String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegner wurder erstellt " + gegnerName + " LP: " + gegnerLeben);
	}

}
