package test1;

public class Main {
	
	/*
	 * public (+) - Zugriff innerhalb und außerhalb der Klasse 
	 * private (-) - Zugriff nur innerhalb der Klasse 
	 * 
	 * protected (#) - Zugriff nur innerhalb der Klasse und Subklassen etc.
	 * package (~) - Zugriff nur innerhalb des Pakets 
	 */
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setAlter(9);
		
		System.out.println(person.getAlter());
		
	}

}
