package kostana.maksic;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Mika");
		set.add("Zika");
		set.add("Luka");
		set.add("Dara");
		
		System.out.println(set);
		System.out.println(set.first());
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}