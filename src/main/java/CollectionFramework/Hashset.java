package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Hashset {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Vinod");
		set.add("Potdar");
		set.add("Pundi");
        
		System.out.println("---- Using Iterator ----");
		Iterator set2 = set.iterator();

		while (set2.hasNext()) {
			System.out.println(set2.next());

			LinkedHashSet<String> set3 = new LinkedHashSet<String>();
			set3.add("Vinod");
			set3.add("Pundi");
			set3.add("Potdar");

			System.out.println(set3);

		}
	}

}
