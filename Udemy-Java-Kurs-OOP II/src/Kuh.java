
public class Kuh extends Tier {

	// Eigenschaften / Attribute
	int hufe;
	
	// Konstruktoren
	public Kuh(String name, int groeße, int gewicht, int hufe){
		super(name,groeße,gewicht);
		this.hufe = hufe;
	}

	// Methoden
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss dsas essen immer wiederkauen");
	}
	
	
	
	
	
}
