package collectionStudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkaedList {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(231.1);
		li.add("amol");
		li.add(null);
		li.add(true);
		li.add(1456);
		li.add("amol");
		li.add('G');
		System.out.println(li);
		System.out.println(li.get(4));
		System.out.println("================");
		System.out.println(li.size());
		System.out.println(li.indexOf('G'));
		System.out.println(li.lastIndexOf("amol"));
		li.add(1, "Satish");
		System.out.println(li);
		System.out.println(li.contains(1456));
		System.out.println(li.size());
//		System.out.println(li.remove(231.1));
//		System.out.println(li);
//		System.out.println(li.remove(0));
//		System.out.println(li);
//		System.out.println("==================");
//		li.clear();
//		System.out.println(li);
		for(int i=0;i<=li.size()-1;i++) {
			System.out.println(li.get(i));
		}
		System.out.println("========================");
        for(Object M:li) {
        	System.out.println(M);
        	
        }
        System.out.println("+==============");
		
        Iterator it = li.iterator();
		
        while(it.hasNext()) {
        	System.out.println();
        }
		
				

	}

}
