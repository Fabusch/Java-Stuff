
public class MethodenReturnII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <Modifikator Rückgabedatentyp Methodenname ( Datentyp Paramter1,Datentyp Paramter2 )>
		// Merke: Eine Methode erledigt eine bestimmte Aufgabe
		
		int a = summe();
		System.out.println("Der Wert aus der Methode summe() ist : " + a); 
		
		int summe = a - 5;
		System.out.println("Der Wert in summe ist: " + summe);
	}
	
	public static int summe(){
		int a,b,summe;
		a = 5;
		b = 5;
		
		summe = a + b;
		
		return summe;
	}

}
