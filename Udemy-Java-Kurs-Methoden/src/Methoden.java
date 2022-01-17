
public class Methoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//<Modifikator Rückgabedatentyp Methodenname ( Datentyp Paramter1, Datentyp Paramter2 )>
// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected
		
		// void = leer
		
		ausgabe();
		summe();
		
	}
	
	public static void ausgabe(){
		System.out.println("Ich bin eine Methode");
	}
	
	public static void summe(){
		int a,b,summe;
		a = 5;
		b = 5;
		
		summe = a + b;
		System.out.println(summe);
		
	}

}
