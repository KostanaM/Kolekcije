package kostana.maksic;

import java.util.*;

public class Main {
	public static void main(String args[]) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Dara");
		map.put(2, "Brana");
		map.put(3, "Maja");
		map.put(4, "Dina");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			map.replace(2, "Brana", "Stana");
		}
	}
}