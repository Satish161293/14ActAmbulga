package accessModifireStudy;

public class FinalUse {
	 static int C= 200;

	public static void main(String[] args) {
		int B = 100;
		System.out.println(B);
		B=B+10;
	
		//System.out.println(C);
		
		System.out.println(B);
		System.out.println("=========================");
		final int A= 100;
		System.out.println(A);
		//A= A+10;
		//System.out.println(A);
		//int C=2;
		System.out.println(C);

	}

}
