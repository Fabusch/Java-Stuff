
public class Hund extends Tier {

	// Eigenschaften / Attribute
	int zaehne;
	
	// Konstruktoren
	public Hund(String name, int groeße, int gewicht, int zaehne){
		super(name,groeße,gewicht);
		this.zaehne = zaehne;
	}
	
	// Methoden
	public void bellen(){
		
	}

	@Override
	public void essen() {
		System.out.println("Der Hund muss sein Essen noch kauen");
	}

	@Override
	public void atmen() {
		System.out.println("Der Hund atmet über die Lunge");
		
	}
	
	

	
	
	
	
}
