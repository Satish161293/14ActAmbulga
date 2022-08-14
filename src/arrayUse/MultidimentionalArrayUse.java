package arrayUse;

public class MultidimentionalArrayUse {

	public static void main(String[] args) {
		
		int SUM [] []= {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
		
		for(int i=0;i<=2; i++) {
			
			for(int j=0; j<=3; j++) {
				System.out.print(SUM[i][j]+" ");
				
			}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		int Sum [][]= {{1,4,7,8},{2,5,8,9}};
		
		for(int a=0; a<=1; a++) {
			
			for(int b=0; b<=3; b++) 
			{
				System.out.print(Sum[a][b]+" ");
				
			}
			System.out.println();
		}
		System.out.println("=======================================");
		
		char Char[][]= {{'A','B','C','D'},{'E','F','G','H'},{'I','J','K','L'},{'M','N','O','P'}};
		
		for(int i= 0; i<=3; i++) {
			
			for (int j=0; j<=3; j++) {
				System.out.print(Char[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=======================================");
		
		

	}

}
