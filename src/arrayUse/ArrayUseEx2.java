package arrayUse;

public class ArrayUseEx2 {

	public static void main(String[] args) {
	
		int RollNum[]=new int [8];
		RollNum[0]=10;
		RollNum[1]=11;
		RollNum[2]=12;
		RollNum[3]=13;
		RollNum[4]=14;
		RollNum[5]=15;
		RollNum[6]=16;
		RollNum[7]=17;
		System.out.println(RollNum[0]);
		System.out.println(RollNum[1]);
		System.out.println(RollNum[2]);
		System.out.println(RollNum[3]);
		System.out.println(RollNum[4]);
		
		System.out.println("====================================");
		//System.out.println(RollNum.length);
		for(int i=0; i<=RollNum.length-1;i++) {
			
			System.out.println(RollNum[i]);
		}
		System.out.println("====================================");
		
         for(int i=RollNum.length-1; i>=0;i--) {
			
			System.out.println(RollNum[i]);
		}
         System.out.println("====================================");
         
         
         
         char Gender []= {'M','F','A','B','C'};
         
         for(char i=0;i<=Gender.length-1; i++)
         {
        	 System.out.print(Gender[i]);
         }
         System.out.println("====================================");
         
         
//         for(char i=  (Gender.length-1); i>=0; i--)
//         {
//        	 System.out.print(Gender[i]);
//         }
         
         System.out.println("====================================");
         String str;
         System.out.println("Enter any string");
          str="Satish";
              for (int i = str.length()-1; i >=0; i--) 
              {
                  System.out.println(str.charAt(i));    
              }
         
         
         System.out.println("====================================");
         
         
         String Name[]= new String [4];
         
         Name[0]="Satish";
         Name[1]="Tejas";
         Name[2]="Meghana";
         Name[3]="Prajkta";
        		 
         
         for(int i=Name.length-1;i>=0;i--)
         {
        	 System.out.println(Name.length);
         }
         
         
         System.out.print("I am Satish \n I am Tejas \n I AM Prajkata \n I Am Meghana");
         
		
	}

}
