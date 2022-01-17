
public class CountNumber implements Runnable {
	
	// Threads parallel laufen lassen: 
	// Das Programm selbst läuft im main Thread 
	// Neben dem main Thread kann man weitere starten, welchen Aufgaben parallel abarbeiten
	// So ist man schneller am Ziel weil man nicht alles nacheinander abarbeitet
	
	@Override
	public void run() {
		
		for(int i = 0; i <= 200; i++) {
			System.out.println("CountNumber: " + i);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Thread  countNumber = new Thread(new CountNumber());
		countNumber.start();
		

		for(int i = 0; i <= 200; i++) {
			System.out.println("ThreadTest: " + i);
		}
		
//		for(int i = 0; i <= 200; i++) {
//			System.out.println("TestTest: " + i);
//		}
		
		
	}

}
