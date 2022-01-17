package de.anonyme.klasse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bisher 
		Person p1 = new Person("Ralf");
		
		// Anonym
		new Person("Olaf") {
			
			@Override
			public void printName() {
				System.out.println("Der Name: " + this.getName());
			}
		};
		
		Hund hund1 = new Hund();
		hund1.machLaute();
		
		Katze katz1 = new Katze();
		katz1.machLaute();
		
		Tier elefant = new Tier() {
			
			@Override
			public String machLaute() {
				return "törö";
			}
		};
		
		Tier schwein = new Tier() {
			
			@Override
			public String machLaute() {
				
				return "oink oink";
			}
		};
		
	}
}
