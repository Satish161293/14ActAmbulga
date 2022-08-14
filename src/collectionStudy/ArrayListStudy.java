package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {

		ArrayList a =new ArrayList();		
		a.add(100);
		a.add(100.99);
		a.add("Satish");
		a.add('L');
		a.add(null);
		a.add(true);
		a.add(2000);
		a.add("Satish");		
		System.out.println(a);
		System.out.println("===========Methods=================");
		System.out.println(a.size());
		System.out.println(a.indexOf(100.99));
		System.out.println(a.contains("satish"));
		System.out.println(a.contains("Satish"));
		a.add(4, "Deglur");
		System.out.println("==========Add==================");
		System.out.println(a);	
		System.out.println("========Remove====================");
		System.out.println(a.remove(4));	
		System.out.println(a);
		System.out.println("===========for loop=================");		
		for(int i=0;i<=7; i++) {
			System.out.println(a.get(i));
		}		
		System.out.println("=============For each loop==================");
		for(Object z:a) {			
			System.out.println(z);
		}
		System.out.println("==========iterator==================");
		Iterator X = a.iterator();
	    while(X.hasNext()) {
	    System.out.println(X.next());
	    
	    }
	    System.out.println("===========listiterator=================");
	    ListIterator X1 = a.listIterator();
	    while(X1.hasNext()) {
	    System.out.println(X1.next());
	    	  
	    
	    }
	    	  
	    	  
	    	  
	      }
	      
		
	}


