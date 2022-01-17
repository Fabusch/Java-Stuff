
public class MehrZuStringBuffer {

	
	// Neben String gibt es den Datentyp (Klasse) Stringbuffer
	// Beim String wird immer ein neuer String erstellt, beim Stringbuffer werden die Änderungen an demselben Objekt durchgeführt
			
	
	public static void main(String[] args) {

	// MERKE: String erzeugt oder verändert -> Es wird immer ein neuer String erstellt, weil Strings immutable(unveräderbar) sind 
	// MERKE: StringBuffer / StringBuilder erzeugt oder verändert -> Es ist immer das selbe Objekt 
		
		
		StringBuffer teStringBuffer = new StringBuffer("Hallo");
		System.out.println(teStringBuffer);
		
		teStringBuffer.append(", Wilkommen in meinem Kurs");
		System.out.println(teStringBuffer);
		
		teStringBuffer.setCharAt(10, 'l');
		System.out.println(teStringBuffer);
		
		StringBuilder stringBuilder = new StringBuilder("Hallo"); // Wie StringBuffer nur erst ab der Version 5 
		StringBuilder stringBuilder2 = new StringBuilder(10);
		System.out.println(stringBuilder2);
		
		
		stringBuilder2.append("Hi...");
		System.out.println(stringBuilder2);
		
		stringBuilder2.insert(5, '!');
		System.out.println(stringBuilder2);
		
		
		
		// Beispiel vom Nachteil String:
		// Es dauert so lange weil in jedem Schleifendruchgang ein neues String Objekt erstellt wird 
//		long timeStart = System.currentTimeMillis(); 
//		
//		String str = "";
//		    for (int i = 0; i < 1000; i++) {
//		      str += i;
//		      System.out.println(str);
//		    }
//		
//		    long timeEnd= System.currentTimeMillis();   
//		    System.out.println("Zeit der Schleife mit String: " + (timeEnd - timeStart));
		    
		    // Zeit der Schleife mit String: 20356
		    
		
		    // Hier das  Beispiel mit einem Stringbuffer
		
//			long timeStart = System.currentTimeMillis(); 
//			
//		    StringBuffer str1 = new StringBuffer();
//		    for (int i = 0; i < 1000; i++) {
//		      str1.append(i);
//		      System.out.println(str1);
//		    }
//		    
//		    long timeEnd= System.currentTimeMillis();   
//		    System.out.println("Zeit der Schleife mit String: " + (timeEnd - timeStart));
		

		    
	}
}
