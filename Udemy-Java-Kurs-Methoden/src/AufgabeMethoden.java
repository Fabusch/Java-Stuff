
public class AufgabeMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Aufgabe:
		 * 
		 * 1. Wert: 3.547 2. Wert: 6.354
		 * 
		 * Definiere (erstelle) eine Methode die als Aufgabe hat, diese zwei
		 * Werte zu multiplizieren (mal nimmt) Diese Werte sollen dabei als
		 * Paramter an die Methode übergeben werden
		 * 
		 * Der Wert der errechnet wird soll dabei zurück gegeben werden, sodass
		 * wir den Wert in der Konsole ausgeben können.
		 * 
		 */

		double zahl1 = 3.547;
		double zahl2 = 6.354;

		double ergebnis = multipliziere(zahl1, zahl2);
		System.out.println("Ergebnis: " + ergebnis);

	}

	public static double multipliziere(double zahl1, double zahl2) {
		double ergebnis = zahl1 * zahl2;

		return ergebnis;
	}

}
