import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Deklaration
		// Datentyp[] Name = new Datentyp[Anzahl];
		int [] lottoZahlen = new int[6];

		//for(Anfangswert; Abbruchbedingung; Zähler)
		for(int i = 0; i< lottoZahlen.length; i++){
			Scanner scan = new Scanner(System.in);
			int zahlUser = scan.nextInt();
			lottoZahlen[i] = zahlUser;
		}
		
		for(int i = 0; i< lottoZahlen.length; i++){
			System.out.println(lottoZahlen[i]);	
		}
		
		
		
		// Merke: Index = Anzahl der Elemente - 1 
		// index hier ist: 0...5
	}

}
