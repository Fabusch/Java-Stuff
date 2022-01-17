
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		Mainboard mainboardAsus = new Mainboard(4, 2, 4);
//		Computer computerPeter = new Computer("Intel", mainboardAsus, 400);
//		System.out.println(computerPeter.mainboard.usbPorts);
//		
//		Computer computerOlga = new Computer(2, 1, 2, "AMD");
//		System.out.println(computerOlga.mainboard.ramSlots);
		
		Auto bmw = new Auto("BMW", "Goodyear", "Winterreifen");
		Auto vw = new Auto("VW", "michelin", "Sommerreifen");
		
		bmw.ausgabeDaten();
		vw.ausgabeDaten();
		
	}

}
