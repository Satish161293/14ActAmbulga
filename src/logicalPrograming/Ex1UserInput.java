package logicalPrograming;

import java.util.Scanner;

public class Ex1UserInput {

	public static void main(String[] args) {
		
		Scanner Sc =new Scanner(System.in);
		System.out.println("Please enter First Value");
		int Sum1 = Sc.nextInt();
		System.out.println("Please enter Second Value");
		
		int Sum2 = Sc.nextInt();
		int Sum =Sum1+Sum2;
		System.out.println("Addition of Two Value is "+ Sum);
		
		
		System.out.println("Please Enter Your Name");
		String Name = Sc.next();
		System.out.println(Name);
		
	}

}
