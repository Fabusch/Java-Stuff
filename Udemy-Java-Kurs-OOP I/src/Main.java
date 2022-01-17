
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zahl = 4;
		System.out.println(zahl);
		
		// Datentyp variableNamen = new Konstruktor();
		Laptop samsungLaptop = new Laptop(8, 600, "Samsung");
		Laptop medionLaptop = new Laptop(4, 400, "Medion");
		
		samsungLaptop.getData();
		medionLaptop.getData();

		Auto bmw = new Auto();
		bmw.marke = "BMW";
		bmw.bremsen();
	
		
		Auto.ausgabe();
		
		

	}

}
