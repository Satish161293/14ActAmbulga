package interfaceStudy;

public class ImplimentsClass implements InterfaceTest2{

	public static void main(String[] args) {
		
		ImplimentsClass IC = new ImplimentsClass();
		IC.Satish();
		IC.Kishor();
		IC.Pranshu();
		IC.Akshay();
		IC.Pooja();
		IC.Rutik();
	}

	@Override
	public void Satish() {
		System.out.println("HI I am Satish");
		
	}

	@Override
	public void Kishor() {

		System.out.println("HI I am KIshor");
		
	}

	@Override
	public void Pranshu() {
		System.out.println("HI I am Pranshu");
		
	}

	@Override
	public void Akshay() {
		System.out.println("HI I am Akshay");
		
	}

	@Override
	public void Pooja() {
		System.out.println("HI I am pooja");
		
	}

	@Override
	public void Rutik() {
		System.out.println("HI I am Rutik");
		
	}

}
