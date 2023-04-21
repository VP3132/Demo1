package CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Vinod");
		list.add("Raju");
		list.add("Pundi");

		System.out.println(list);
		System.out.println(list.add("Pundi"));

		System.out.println(list.size());

		ArrayList list3 = new ArrayList();
		list3.add(12);
		list3.add("Vinod");
		list3.add("Sangli");
//    Murge two object
		list.addAll(list3);
		System.out.println(list);

		
		list.remove(0);
		System.out.println(list);
		
		list.removeAll(list3);
		
		System.out.println(list);
		System.out.println(list3);
		
//		list.clear();
		System.out.println(list);
		
		
		System.out.println("----using Listiterator----");
		ListIterator itr= list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---Using Previous---");
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			
			
		}
		
		
//		list.contains("Vinod");
//		list.indexOf(2);
//		Iterator list2 = list.iterator();
//		
		// System.out.println(list2.hasNext());
//
//		while (list2.hasNext()) {
//			System.out.println(list2.next());
//		}
//		
//		Object [] array = new Object[5];
//		
//		array[0]="string";
//		array[1]=2;
//		array[2]=true;
//		
//		
//		for(Object z:array) {
//			System.out.println(z);
//		}
		

//		System.out.println("-----Itteration using for loop-----");
//	for(int i=0;i<list.size();i++) {
//		System.out.println(list.get(i));
//	}

//	for( String list3:list) {
//		System.out.println(list.indexOf(list3));
//		System.out.println(list3);
//	}
	}
}