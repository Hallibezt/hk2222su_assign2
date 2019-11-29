package hk222su_assign2;



public class AllOdd {
	
	public static void main(String[] args) {
	
		int [] allNumbers = new int[10];
		
		for (int i=0; i < allNumbers.length; i++) {
			 allNumbers[i] = (int) ((Math.random() *100) + 1) ;		 
		
		}
		
		System.out.println("The ten random numbers are: ");	
		
		for(int e: allNumbers) {
			System.out.print( e + " ");
		}
			System.out.println();
			System.out.println();
			System.out.println("Whereof, the odd numbers are : ");
			
			
		for(int i = 0; i < allNumbers.length; i++ ) {
			if (allNumbers[i] % 2 == 0 ) {}
			else
				System.out.print(allNumbers[i] + " ");
		}
	
	}
}		
	

