
public class BeispielMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Merke: Eine Methode erledigt eine bestimmte Aufgabe
		
		int gegnerLeben = 100;
		System.out.println("Der Boss hat: " + gegnerLeben);
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebenspunkte");
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebenspunkte");
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebenspunkte");
		
		
		
	}
	
	public static int gegnerHit(int aktuellLeben){
		int neuGegnerLeben;
		
		neuGegnerLeben = aktuellLeben - 20;
		
		return neuGegnerLeben;
	}
	

}
