package accessModifireStudy;

import typesOfVariable.GloableVariable;

public class PublicUse {

	public static void main(String[] args) {
		PublicUse PU1 = new PublicUse();
		PU1.Ambulga();
		GloableVariable G =new GloableVariable();
		G.Pradip();
	}
	public void Ambulga() {
		System.out.println(" I am From Ambulga "); // scope of public Access modifire is with in the project 
	
		
	}

}
