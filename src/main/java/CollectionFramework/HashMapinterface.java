package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapinterface {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vinod", 12);
		map.put("Rahul", 13);
		map.put("Sandeep", 14);
		map.put("Ruturaj", 13);
		map.remove("Vinod", 12);

		System.out.println(map);

		TreeMap<String, Integer> map3 = new TreeMap<String, Integer>();
		map3.put("Vinod", 12);
		map3.put("Rahul", 13);
		map3.put("Sandeep", 15);
		map3.put("Ruturaj", 14);

		System.out.println(map3);

		LinkedHashMap<String, Integer> map4 = new LinkedHashMap<String, Integer>();
		map4.put("Ruturaj1", 1);
		map4.put("Ruturaj2", 2);
		map4.put("Ruturaj3", 3);
		map4.put("Ruturaj4", 4);

		System.out.println(map4);

	}
}
