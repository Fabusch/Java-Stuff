
public class Hund {
	
	// Eigenschaften / Attribute
	int alter;
	String name;
	String rasse;
	
	// Konstruktoren
	public Hund(){
		
	}
	
	public Hund(int alter, String name, String rasse){
		this.alter = alter;
		this.name = name;
		this.rasse = rasse;
	}
	
	// Methoden
	public void bellen(){
		System.out.println("Der Hund: " + this.name + " bellt" );
	}
	
}
