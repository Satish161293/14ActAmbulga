package typesOfVariable;

public class GloableVariable {
       int A =1200;
       static int B=100;
	  float  age;
	byte rollnum;
	short amount;public static void main(String[] args) 
	{
		GloableVariable GB =new GloableVariable();
		GB.Pradip();
	System.out.println(GB.A);
	System.out.println(B);
	
	
	
	}
	public void Pradip() {
		int A =100;
		age =27.2f;
		rollnum=120;
		amount = 12000;
		
	System.out.println(A);
	System.out.println(age);
	System.out.println(rollnum);
	System.out.println(amount);
	System.out.println(this.A);
	}

}



