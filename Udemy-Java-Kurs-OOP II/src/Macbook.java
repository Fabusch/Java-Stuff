
public class Macbook extends Laptop  {
	
	// Eigenschaften / Attribute
	boolean touchBar;
	
	// Konstruktor
	public Macbook(String marke, int ram, String cpu, double preis, boolean touchBar){
		super(marke,ram,cpu,preis);
		this.touchBar = touchBar;
	}

	// Methoden
	@Override
	public void starten() {
		//super.starten();
		System.out.println("Macbook startet");
	}
	
	
}
