package Pattern;

public class Ex6 {

	public static void main(String[] args) {
		
//		*****
//		****
//		***
//		**
//		*
//		**
//		***
//		****
//		*****
		int Star =5;
		int Space =0;
		
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
			if(i<5)
			{
				Star--;
			}
			else
			{
				Star++;
			}
			System.out.println();
		}


	}

}
