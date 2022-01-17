package de.lokale.klasse;

public class Mannschaft {

	// Methode der Klasse Mannschaft
	public void erstelleSportler() {

		class Sportler {

			String name;
			int alter;

			public Sportler(String _name, int _alter) {
				name = _name;
				alter = _alter;
			}

			public void getSportler() {
				System.out.println("Sportler erstellt: " + this.name + " Alter: " + this.alter);
			}

		}

		Sportler sp1 = new Sportler("Peter", 23);  // Es wird ein neues Objekt der Klasse Sportler erstellt und dies ist ein einfacher Sportler
		Sportler sp2 = new Sportler("Mike", 26);
		Sportler sp3 = new Sportler("Hans", 34);
		Sportler sp4 = new Sportler("Dirk", 66);
		

		sp1.getSportler();
		sp2.getSportler();
		sp3.getSportler();
		sp4.getSportler();
	} // Ende der Methode

}
