import java.util.HashMap;
import java.util.Map;

import javafx.scene.effect.PerspectiveTransform;

class Schluessel{
	
	private int id;
	
	public Schluessel(int id){
		this.id = id;
	}
	
	public String toString(){
		return "ID: " + this.id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schluessel other = (Schluessel) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Was ist ein Assoziativspeicher? Assoziation = hat Beziehung 
		// Der Inhalt hat eine "Beziehung" zum Schlüssel
		
		// Jeder Inhalt hat seinen besonderen Schlüssel
		// Es gibt keine doppelten Schlüssel, sonst wird der alte überschrieben
		
		// K = Key = Schlüssel
		// V = Value = Wert = Inhalt
		
		
		// Map mit fertigen Klassen
		Map<Integer, String> map1 = new HashMap<>();
		
		map1.put(1234, "Tisch viru");
		map1.put(2345, "Stuhl jsduij");
		
		System.out.println("Wert: " + map1.get(1234));
		
		for(Integer key: map1.keySet() ){
			System.out.println("Artikelnummer: " + key);
			String value = map1.get(key);
			System.out.println("Wert: " + value);
		}
		
		System.out.println("--------");
		
		// Map mit eigener Klasse -> Keys
		Map<Schluessel,String> map2 = new HashMap<>();
		Schluessel s1 = new Schluessel(1234);
		Schluessel s2 = new Schluessel(3456);
		Schluessel s3 = new Schluessel(1234);
		
		map2.put(s1, "Tisch von Nebenan");
		map2.put(s2, "Tisch blau");
		map2.put(s3, "Tisch gruen");
			
		for(Schluessel key: map2.keySet()){
			System.out.println("Key: " + key + " Inhalt: " + map2.get(key));
		}
		
		
	}

}
