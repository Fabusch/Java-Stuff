
public class MehrZuStingBuffer {

	
	public static void main(String[] args) {
		
		// Neben String gibt es den Datentyp (Klasse) Stringbuffer
		// Beim String wird immer ein neuer String erstellt, beim Stringbuffer werden die Änderungen an demselben Objekt durchgeführt
		
		
		// MERKE: String erzeugt oder verändert -> Es wird immer ein neuer String erstellt, weil Strings immutable(unveräderbar) sind 
		// MERKE: StringBuffer erzeugt oder verändert -> Es ist immer das selbe Objekt 
		
		
		
		// String, StringBuffer oder StringBuilder?
		// In dem meisten Fällen verwendet man einen String 
		// Soll die Zeichenkette jedoch dynamisch veränderbar sein bzw. wird ständig verändert z.B. in einer Scheife dann sollte man sich überlegen doch nicht einen StringBuffer / StringBuilder zu nutzen
		
		
		StringBuffer test = new StringBuffer("Hallo"); // Ab der Version 1
		System.out.println(test);
		
		// Methoden um den Stringbuffer zu verändern
		// append()
		// insert()
		// delete()
		// setCharAt()
		
		test.append(", Wilkommen in meinem Kurs");
		System.out.println(test);
		
		test.setCharAt(10, 'l');
		System.out.println(test);
		
		test.deleteCharAt(1);
		System.out.println(test);
		
		
		// Beispiel vom Nachteil String:
		// Es dauert so lange weil in jedem Schleifendruchgang ein neues String Objekt erstellt wird 
//		 String str = "";
//		    for (int i = 0; i < 1000; i++) {
//		      str += i;
//		      System.out.println(str);
//		    }
		
		
		    // Hier das  Beispiel mit einem Stringbuffer
//		    StringBuilder str = new StringBuilder();
//		    for (int i = 0; i < 1000; i++) {
//		      str.append(i);
//		      System.out.println(str);
//		    }
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
