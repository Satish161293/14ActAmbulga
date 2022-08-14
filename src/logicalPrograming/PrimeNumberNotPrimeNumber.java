package logicalPrograming;

public class PrimeNumberNotPrimeNumber {

	public static void main(String[] args) 
	{
//		int num =93;
//		int count = 0;
//		for (int i=2;i<=num;i++)
//		{
//			if(num % i ==0) 
//			{				
//				count ++;
//				break;				
//			}
//			if (count==1)
//			{
//				System.out.println("Given Number "+num+" is Not Prime Number");
//			}
//			else
//			{
//				System.out.println("Given Number "+num+" is  Prime Number");
//			}
//		}
//		
		int Num =35;
		int count = 0;
		for (int i=2;i<=Num;i++)
		{
			if (Num %i==0)
			{
				count++;
				break;
			}
			if(count==1)
			{
				System.out.println("Given Number "+Num+"Is not Prime");
			}
			else
			{
				System.out.println("Given Number "+Num+"Is  Prime");
			}
		}
		

	}

}
