package kostana.maksic;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Maja");
		list.add("Branko");
		list.add("Deni");
		list.add("Cane");
		System.out.println(list);

		System.out.println(list.get(1));

		list.set(1, "Mika");

		for (String al : list)
			System.out.println(al);
		
		System.out.println(list.size());
	}
}
