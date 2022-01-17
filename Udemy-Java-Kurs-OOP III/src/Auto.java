
public class Auto {
	
	// Eigenschaften / Attribute
	String autoMarke;
	Reifen reifen;
	
	// Konstruktor
	public Auto(){
		
	}
	
	public Auto(String autoMarke, String reifenMarke, String reifenTyp){
		this.autoMarke = autoMarke;
		reifen = new Reifen(reifenMarke, reifenTyp);
		
	}

	// Methoden
	public void ausgabeDaten(){
		System.out.println("Die Automarke ist: " + this.autoMarke + " und der ReifenTyp ist: " + this.reifen.reifenMarke);
	}
	

}
