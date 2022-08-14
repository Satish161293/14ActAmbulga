package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
	      Vector V = new Vector();
	      V.add("Satish");
	      V.add(124.55);
	      V.add(126);
	      V.add('N');
	      V.add(null);
	      V.add(true);
	      V.add("Satish");
	      V.add(null);	      
	      System.out.println(V);
	      System.out.println(V.size());
	      System.out.println(V.get(5));
	      System.out.println(V.indexOf("Satish"));
	      System.out.println(V.lastIndexOf("Satish"));
	      System.out.println(V.contains(null));
	      System.out.println("============for===============");
	      for(int i=0; i<=7; i++) {
	    	  System.out.println(V.get(i));
	      }
	      System.out.println("============  for each===================");
	      for(Object X:V) {
	    	  System.out.println(X);
	      }	      
	      System.out.println("========Iterator==========");
	      Iterator it = V.iterator();
	      while(it.hasNext()) {
	    	  System.out.println(it.next());	    
	      }
	      System.out.println("=======ListIterator===========");	      
	     ListIterator Li = V.listIterator();
	     while(Li.hasNext()) {
	    	 System.out.println(Li.next());
	     }
	     System.out.println("=========Enumeration=========");
	    Enumeration SP = V.elements();
	    
	    while(SP.hasMoreElements()) {
	    	System.out.println(SP.nextElement());
	    }
}
}
