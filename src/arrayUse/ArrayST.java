package arrayUse;

public class ArrayST {

	public static void main(String[] args) {

   
     int Num1[][] = {{1,2,3},{1,2,3},{1,2,3}};
         for(int i=0;i<=Num1.length-1;i++) {
        	 for(int j=0; j<=i; j++) {
        	 System.out.print(Num1[i][j]);
        		// System.out.print("*");
        	 }
        	 System.out.println();
         }
         System.out.println("=================");
         for(int i=0;i<=Num1.length-1;i++) {
        	 for(int j=Num1.length-1;j>=i;j--) {
        		 System.out.print(Num1[i][j]);
        		// System.out.print("*");
        	 }
        	 System.out.println();
         }
	}

}
