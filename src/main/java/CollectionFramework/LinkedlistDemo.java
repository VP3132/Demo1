package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);

		System.out.println(list);

		LinkedList ld = new LinkedList(list);
		ld.add("Vinod");

		ld.add("Potdar");
		ld.add(27);
		ld.add("Pundi");
		ld.add(416312);
		ld.add(null);
		System.out.println(ld);

		ld.remove("Pundi");
		System.out.println(ld);

		System.out.println(ld.contains("Pundi"));

		System.out.println(ld.size());
		ld.removeLast();
		System.out.println(ld);
//		ld.clear();
		ld.isEmpty();
		System.out.println(ld);
		System.out.println(ld.isEmpty());

		ArrayList list2 = new ArrayList(ld);

		list2.add(19);
		list2.add(19);
		list2.add(19);
		list2.add(19);

		System.out.println(list2);
	}

}
