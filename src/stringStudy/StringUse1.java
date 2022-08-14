package stringStudy;



public class StringUse1 {

	public static void main(String[] args) {
		
		
	   String Name= "Ambulgekar";		
       String Name1 = "Ambulgekar";
       String Name0= "ambulgekar";
       String m = new String("Degloor");
       String m1 =new String("Degloor");
       String m2 =new String("ambulgekar");
       int Z1=  Name1.length();
       System.out.println(Z1);
       System.out.println(Name.length());         
       System.out.println("=====================");
       System.out.println(Name==Name1);
       System.out.println(Name==Name0);
       System.out.println(m==m1);
       System.out.println(m.equals(m1));
       System.out.println(Name0.equals(m2));
       System.out.println("=====================");
       System.out.println(Name.toUpperCase());     
       System.out.println(m.toUpperCase());  // convert upper case to lower case;
       System.out.println("=====================");
       String A = Name.toUpperCase();
       System.out.println(A.toLowerCase());
       System.out.println("=====================");
      
       System.out.println(Name1.equalsIgnoreCase(Name0));      
       System.out.println(A);
       System.out.println("=====================");
       
       //contents() Method use 
       String X= "Nanded";
       System.out.println(X.contains("A")); //need sequence of  Character then true other wise false
       System.out.println("=====================");
       
       
          //isEmety method(); Use
       
       String Adress= "Sangvi";
       String Adress1="";
       String Aderss3=" ";
    //String Adress4=null; null point ecxeption error
       System.out.println(Adress.isEmpty());
       System.out.println(Adress1.isEmpty());
       System.out.println(Aderss3.isEmpty());
       System.out.println("=====================");
       String Name10 = "Amravati";
       System.out.println(Name10.charAt(5));
       System.out.println(Name10.charAt(7));
       System.out.println("=====================================");
       
       // Start With Methods  And  endsWith method
       
       String NAME =  "hSatish";                //"My Permanent Address is At Ambulga Post Martoli Tq Deglur";
       //System.out.println(NAME.startsWith("My Permanent"));
       System.out.println(NAME.startsWith("tish",2));
       System.out.println("=====================");
       System.out.println(NAME.endsWith("tish"));
       System.out.println(NAME.endsWith("h"));
       
       
       
       
      
       
       
;      
       
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
