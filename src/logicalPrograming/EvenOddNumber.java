package logicalPrograming;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) 
	{
		
		Scanner Sc = new Scanner(System.in);
		System.out.println("ENter Number");
		int Num = Sc.nextInt();
		
		if (Num % 2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}

    


	}

}
