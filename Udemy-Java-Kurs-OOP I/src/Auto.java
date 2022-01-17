
public class Auto {
	
	// Eigenschaften / Attribute
	static int reifenAnzahl = 5;
	
	int reifen;
	int preis;
	
	String marke;
	
	
	// Konstruktoren
	public Auto(){
		
	}
	
	public Auto(int reifen, int preis, String marke){
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}

	public static void ausgabe(){
		System.out.println("Ich bin eine Klassenmethode und brauche kein Objekt");
	}
	
	// Methoden
	public void gasgeben(){
		System.out.println("Das Auto mit der Marke: " + this.marke + " fährt jetzt los");
	}
	
	public void bremsen(){
		System.out.println("Das Auto mit der Marke: " + this.marke + " bremst!");
	}
	
	public void vergleichePreis(int preis){
		if (this.preis <= preis ){
			System.out.println("Der " + this.marke + " ist billiger");
		}else {
			System.out.println("Der " + this.marke + " ist teurer");
		}
	}
	
	
	
	
}
