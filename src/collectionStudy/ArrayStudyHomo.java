package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayStudyHomo {

	public static void main(String[] args) {
		ArrayList<Character> PSD = new ArrayList<>();
		
		PSD.add('P');
		PSD.add('S');
		PSD.add('O');
		PSD.add('A');
		PSD.add('O');
		PSD.add('T');
		PSD.add('J');
		PSD.add('I');
		PSD.add('A');
		PSD.add('S');
		PSD.add('P');
		PSD.add('H');
		System.out.println(PSD);
		System.out.println(PSD.size());
		System.out.println(PSD.get(10));
		System.out.println(PSD.contains('Y'));
		System.out.println(PSD.contains('P'));
		System.out.println(PSD.indexOf('S'));
		System.out.println(PSD.lastIndexOf('S'));
		System.out.println();
		System.out.println(PSD.remove(3));
	    PSD.add(3, 'A');
		
        System.out.println("============each for loop===================");
		
        for(Character M:PSD) {
	    System.out.println(M);
		}
		System.out.println("==========iterater=====================");
	    Iterator<Character> it = PSD.iterator();
		while(it.hasNext()) {
			
		System.out.println(it.next());
		}
		System.out.println("===============================");
		
	}

}
