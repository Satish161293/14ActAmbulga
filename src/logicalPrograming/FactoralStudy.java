package logicalPrograming;

public class FactoralStudy {

	public static void main(String[] args) 
	{
		int num =7;
		int fact =1;
		for(int i=num;i>=1;i--)
		{
		     fact= fact*i;
		}
		System.out.println(fact);
		int Num =8;
		int Fact =1;
		for (int i=Num;i>=1;i--)
		{
			Fact=Fact*i;
		}
		System.out.println(Fact);
		
System.out.println("==================================");
//        Reverse Example
		String Name = "Satish";
		String Rev ="";
		for(int i=Name.length()-1;i>=0;i--)
		{
			Rev=Rev+Name.charAt(i);
		}
		System.out.println(Rev);
	}

}
