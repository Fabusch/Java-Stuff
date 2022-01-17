
public class BMW extends Auto {

	boolean xDrive;
	
	public BMW(int ps, int tuerenAnzahl, String farhzeugTyp, boolean xDrive) {
		super("BMW", ps, tuerenAnzahl, farhzeugTyp);
		this.xDrive = xDrive;
		
	}

	@Override
	public void starten() {
		super.starten();
		System.out.println("Nämlich der BMW startet");
	}

	
	
	
}
