
public class Laptop {
	
	// Eigenschaften / Attribute
	int ram;
	double preis;
	String marke;
	
	// Konstruktoren
	public Laptop(int ram, double preis, String marke){
		this.ram = ram;
		this. preis = preis;
		this.marke = marke;
	}
	
	// Methoden
	public void getData(){
		System.out.println("Ram: " + this.ram + " Preis. " + this.preis + " Marke: " + this.marke);
	}
}
