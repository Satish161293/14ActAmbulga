package Pattern;

public class Ex5 {

	public static void main(String[] args) 
	{
		// *         *
        // **       **
        // ***     ***
//		   ****   ****
//		   ***** *****
//		   ****   ****
//		   ***     ***
//		   **       **
	//	   *         *
        
		int Star=1;
		int Space =5;
		int Star1 =1;
		int Space1 =4;	
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=Star;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=Space;k++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=Space1;l++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=Star1;m++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				Star++;
				Space--;
				Star1++;
				Space--;
			}
			else
			{
				Star--;
				Space++;
				Star1--;
				Space1++;					
			}
			System.out.println();
			}
			
			
		}

}

