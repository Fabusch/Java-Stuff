import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import DSUebung.Kontakt;

public class SortedSetList {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		// ArrayList
		list1.add("Peter");
		list1.add("Adrian");
		list1.add("Michi");
		list1.add("Peter");
		list1.add("Bernd");

		System.out.println("Liste unsortiert: ");
		for (String string : list1) {
			System.out.println(string);
		}

		Collections.sort(list1);

		System.out.println("\nListe sortiert");
		for (String string : list1) {
			System.out.println(string);
		}

		Set<String> set1 = new TreeSet<String>();

		set1.add("Peter");
		set1.add("Adrian");
		set1.add("Michi");
		set1.add("Peter");
		set1.add("Bernd");

		System.out.println("\nSet sortiert: ");
		for (String string : set1) {
			System.out.println(string);
		}

		List<Kontakt> list2 = new ArrayList<Kontakt>();
		list2.add(new Kontakt("Peter", "0329842232"));
		list2.add(new Kontakt("Chris", "2384324324"));
		list2.add(new Kontakt("Adrian", "32028423"));

		System.out.println("\n\n\nListe unsortiert: ");

		for (Kontakt kontakt : list2) {
			System.out.println(kontakt.getName() + " Tel-Nr: " + kontakt.getTelefonNummer());
		}

		// Collections.sort(list2);

	}

}
