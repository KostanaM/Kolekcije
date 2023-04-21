package kostana.maksic;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet();

		set.add("Miso");
		set.add("Marko");
		set.add("Mico");
		set.add("Milan");
		set.add("Mika");

		set.remove("Mika");
		Iterator<String> i = set.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}