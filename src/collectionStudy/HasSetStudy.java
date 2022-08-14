package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetStudy {

	public static void main(String[] args) {
		  HashSet HS =new HashSet();
		   
		   HS.add("Satish");
		   HS.add(230.1);
		   HS.add(23.12);
		   HS.add(null);
		   HS.add(true);
		   HS.add("Satish");
		   HS.add("Deshmukh");
		   System.out.println(HS);
		   System.out.println("==========================");
		   System.out.println(HS.size());
		//   System.out.println(HS.get(2));
		   System.out.println(HS.contains(23.12));
		   System.out.println(HS.contains(HS));
		   System.out.println("============for each==================");
		   for(Object M:HS) {
			   System.out.println(M);
		   }
		   System.out.println("============Iterator==============");
		    
		   Iterator A = HS.iterator();
		     while(A.hasNext()) {
		    	 System.out.println(A.next());
		    	 
		     }
		     System.out.println("==========================");
		   HS.clear();
		   System.out.println(HS);
		   System.out.println(HS.isEmpty());
	}

}
