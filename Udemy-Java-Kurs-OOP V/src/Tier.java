
public abstract class Tier {

	// Eigenschaften / Attribute
	String name;
	int groeße;
	int gewicht;
	
	// Konstruktoren
	public Tier(){
		
	}
	
	public Tier(String name, int groeße, int gewicht){
		this.name = name;
		this.groeße = groeße;
		this.gewicht = gewicht;
	}
	
	// Methoden
	public abstract void essen();
	
	public abstract void atmen();
	
	public String getName(){
		return name;
	}
	
}
