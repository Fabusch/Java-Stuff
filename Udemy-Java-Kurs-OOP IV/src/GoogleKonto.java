import java.util.Scanner;

public class GoogleKonto {

	// Eigenschaften / Attribute
	private String benutzerName;
	private String passwort;

	// Konstruktor
	public GoogleKonto(String benutzerName, String passwort) {
		this.benutzerName = benutzerName;
		this.passwort = passwort;
	}

	// Methoden
	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {

		if (passwort.equals(this.passwort)) {
			System.out.println("Passwort stimmt kann geändert werden");
			System.out.println("Bitte neues Passwort eingeben...");
			Scanner scan = new Scanner(System.in);
			String newPw = scan.nextLine();
			this.passwort = newPw;
			System.out.println("Das neue Passwort lautet: " + this.passwort);
		} else {
			System.out.println("Passwort falsch, kann nicht geändert werden");
		}

	}

	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}

}
