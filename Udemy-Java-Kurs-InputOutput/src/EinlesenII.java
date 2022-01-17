import java.util.Scanner;

public class EinlesenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		
		// Aufgabe
		/*
		 * Erstelle erneut ein Objekt der Klasse Scanner 
		 * und lese 2 Werte mithilfe dieser Klasse ein
		 * 
		 * 1. ist eine Ganzzahl, die Zahl soll dein Alter sein
		 * 2. ist eine Zeichenkette(String), dein Namen
		 * 
		 * Am Ende soll dein Alter und dein Namen in der Konsolen ausgegeben werden 
		 * System.out.println("Name: " +...+ " Alter: " +...)
		 */
		
		Scanner scan1 = new Scanner(System.in);
		String name = scan1.next();
		int alter = scan1.nextInt();
		
		System.out.println("Name: " + name + " Alter: " + alter );
	}

}
