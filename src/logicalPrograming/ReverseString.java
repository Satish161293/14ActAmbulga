package logicalPrograming;



public class ReverseString {

	public static void main(String[] args) 
	{
		String Name= "Satish";
		String rev ="";
//		Scanner  Sc = new Scanner(System.in);
//		System.out.println("Please Enter Your Name");
//		Sc.next();
		for(int i=Name.length()-1;i>=0;i--)
		{
			rev=rev+Name.charAt(i);
		}
		System.out.println("Orignan Name is "+Name);
		System.out.println("Reverse Name is "+rev);
		
		
		
		
		
		String Name1 ="Satish Govindrao Deshmukh";
		String Rev = "";
		for (int i=Name1.length()-1;i>=0;i--)
		{
			Rev=Rev+Name1.charAt(i);
		}
		System.out.println("Orignan Name1 is  "+Name);
		System.out.println("Reverse Name is  "+Rev);
		
		
	   String City = "Ambulga";
	   String Blank="";
	   for (int i=City.length()-1;i>=0;i--)
	   {
		  Blank= Blank+City.charAt(i);
		   
	   }
	   System.out.println("Orignal String is "+City);
	   System.out.println("Revers String is "+Blank);
		
		
		

	}

}
