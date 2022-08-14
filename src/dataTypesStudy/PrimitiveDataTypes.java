package dataTypesStudy;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		byte  A= 100;
		short B=120;
		int C= 1200;
		long D=2000;
		
		D=D+100;
		
		int A1= 1230;
		char Gender = 'M';
		float Weight = 62.786f;
		double hight =163d;
		double Sum2 =Weight +hight;
		System.out.println(Sum2);
		
		System.out.println(A1);
		System.out.println(Gender);
		
		short  Sum= (short) (A + B + C +D);
		System.out.println(Sum);
		int  Sum1= (int) (A + B + C +D);
		System.out.println(Sum);
		System.out.println(Sum1);
	
	}

}
