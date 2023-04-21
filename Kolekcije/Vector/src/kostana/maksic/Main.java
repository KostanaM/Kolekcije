package kostana.maksic;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();

		v.add("Cane");
		v.add("Dane");
		v.add("Miso");
		v.add("Bozo");

		Iterator<String> itr = v.iterator();

		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		}
	}
