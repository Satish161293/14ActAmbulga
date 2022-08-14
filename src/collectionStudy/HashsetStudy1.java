package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class HashsetStudy1 {

	public static void main(String[] args)
	{
   HashSet HS =new HashSet();
   
   HS.add("Satish");
   HS.add(230.1);
   HS.add(23.12);
   HS.add(null);
   HS.add(true);
   HS.add("Satish");
   HS.add("Deshmukh");
   System.out.println(HS);
   
   System.out.println("++++++++++++++++");
   for(Object M:HS) {
	   System.out.println(M);
   }
   System.out.println("++++++++++++++++");
    
   Iterator A = HS.iterator();
     while(A.hasNext()) {
    	 System.out.println(A.next());
     }
     
       
			 
		 

	}

}
