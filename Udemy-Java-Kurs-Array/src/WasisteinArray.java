import javax.security.auth.kerberos.KerberosKey;

public class WasisteinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variable Deklaration
		// Datentyp Name = Wert;
		int zahl = 50;
		double zahl1 = 34.34;
		
		// Array Deklaration
		// Datentyp[] Name = new Datentyp[Anzahl];
		int [] zahlenArray = new int[7];
		zahlenArray[3] = 50;
		zahlenArray[5] = 500;
		zahlenArray[0] = 40;
		
		double [] zahlenArray1 = new double[7]; // Nur das Array erstellt
		zahlenArray1[1] = 34.23;
		zahlenArray1[4] = 50.45;
		
		String [] personA = {"Peter","Müller","35"};
		System.out.println("Name: " + personA[0]);	

	}
	
}
