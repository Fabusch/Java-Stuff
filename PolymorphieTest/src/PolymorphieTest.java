
public class PolymorphieTest {

	// Polymorphie = Vielgestaltigkeit / Vielfalt
	
	public static void main(String[] args) {
	
// Warum ist das wichtig?
// Die Polymorphie wird dann wichtig wenn es erst zur Laufzeit des Programmes klar ist welches Auto es sein soll!
// Beispielweise gibt es ein Pogramm wo der Nutzer sich für einen BMW oder einen Audi entscheiden kann

		
		Auto auto = new Bmw();
		auto.starten();
		
//		Audi auto1 = new Audi();
//		auto1.starten();
		
		
		
	}

}
