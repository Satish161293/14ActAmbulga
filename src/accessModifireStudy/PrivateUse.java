package accessModifireStudy;

public class PrivateUse {
	
	private int A= 123;
	private int B= 10;
	

	public static void main(String[] args) {
		PrivateUse PU = new PrivateUse();
		System.out.println(PU.A);
		System.out.println(PU.B);
		PU.Satish();
		DefaultUse DU =new DefaultUse();
		DU.Pooja();

	}
	private void Satish() {
		 int C= 110;
		System.out.println(C);
		
	}

}
