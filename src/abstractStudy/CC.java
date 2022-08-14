package abstractStudy;

public class CC extends AbstractStudy {
	int A= 100;
	String reasult = "pass";
	
	public static void main(String[] args) {
		CC c = new CC();
		c.Patil();
		c.pooja();
		c.Satu();
		c.Sonya();
		
		 c.pooja();
		
		AbstractStudy.Satish();
		System.out.println(c.A)
		;
		 System.out.println("Ambulgekar");
		 System.out.println(c.reasult);
		
		
		
		 
	}

	@Override
	public void Sonya() {
		System.out.println("Hi I am Sonya");
		
	}

	@Override
	public void Satu() {
		System.out.println("Hi I am Satu");
		
	}

	@Override
	public void pooja() {
		System.out.println("Hi I am Pooni");
		
	}

	@Override
	public void Patil() {
		System.out.println("Hi I am Patil");
	
	}


	
		
		
	}

	
	


