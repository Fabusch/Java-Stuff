
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kontrollstrukturen steuern den Programmablaufplan
		
				// while = solange
				
				/* Allgemeiner Aufbau einer while-Schleife
				 * 
				 * while(Bedingung){
				 * 
				 * 		Anweisungsblock
				 * }
				 * 
				 * Merke: Bedingung kann entweder true = wahr oder false = nicht wahr sein
				 */
		int count = 1;
//		while(count != 6){ // true
//			System.out.println("Ich bin: " + count);
//			count ++;
//		}
		
		while(true){
			System.out.println("HI");
			if (count == 3){ // true
				break;
			}
			count++; // Zähler
		}
		
		
		
	}

}
