package stringStudy;

public class StringUse {

	public static void main(String[] args) {
		String Satish= new String("Pooja, Satish, Deshmulh ");
		String Satish1= new String("Pooja");
		
		System.out.println(Satish);
		System.out.println(Satish);
		System.out.println(Satish1);
		
		System.out.println("==================================");
		
		String S = new String("I Did My Graduation in Mechanical");
		
		
		System.out.println(S);
		System.out.println("==================================");
		String[] D = S.split(" ");
		for(int i=0; i<=5; i++) {
			
			System.out.println(D[i]);
		}
		
	
	
	}
}
