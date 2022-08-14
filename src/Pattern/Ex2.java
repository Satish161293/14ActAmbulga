package Pattern;

public class Ex2 {

	public static void main(String[] args) 
	{
//		      *   *
//		    **   **
//		   ***  ***
//		  **** ****
//		 **********
//		  **** ****
//		   ***  ***
//		    **   **
//		     *    *

		int Star  = 1;
		int Space  =5;
		int Star2 = 1;
		int Space2=4;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=Space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=Star;k++)
			{
				System.out.print("*");
			}
			for(int m=1;m<=Space2;m++)
			{
				System.out.print(" ");
				
			}
			for(int l=1;l<=Star2;l++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				Space--;
				Star++;
				Star2++;
				Space2--;
			}
			else
			{
				Space++;
				Star--;
				Star2--;
				Space2++;
			}
		  
			
			System.out.println();
		}
	

	}
	
	
	
}






