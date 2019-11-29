package hk222su_assign2;

public class Lotto {
	
	public static void main(String[] args) {
		
		int [] lotto = new int[35];
		
		
		//create list with all numbers
		for (int i=0; i < lotto.length; i++) {			
			 lotto[i] = i + 1;		
			 		 	}
		
		//shuffel them and then print out first seven
		for(int i = 0; i < lotto.length; i++) {		
			//creating value from the lotto index(35) in random order
			int j = (int) (Math.random() * lotto.length);
			
			//assigning the new random value to index of lotto list
			int temp = lotto[i];
			lotto[i]= lotto[j];
			lotto [j] = temp;
		}
		
		
		
		System.out.println("The lotto numbers for tonight are: ");
		for(int i = 0; i<7; i++) {
			System.out.print(lotto[i] + " ");
		}
			
			
			
		
		
	
	}

}
