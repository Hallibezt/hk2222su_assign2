package hk222su_assign2;

import java.util.*;

public class Ants {
	
	public static int[] ants() {
		List<Integer> lotto =  new ArrayList<Integer>();
		
		lotto.add(-1);
		lotto.add(0);
		lotto.add(1);
		Collections.shuffle(lotto);
		
		int n;
		int m = lotto.get(0);
		
		if (m != 0)
			 n = 0;
		else
			n = lotto.get(1);
		
		
		int [] ant = {m,n};
	
		
		return ant;
		
	}
	
	public static int chessBoard(int k, int l) {
		int count = 0;
		int [][] chess = new int[8][8];
			for(int i = 0;  i < chess.length; i++ ) {				
				for(int j = 0; j< chess[i].length; j++) {
					count++;
					chess[i][j]=count;
					
				}
			}
				    
			int number = chess[k][l];
			return number;
		}
	
	
	
public static boolean legalMove(int k, int l, int m, int n) {
	
	
	if (k+m < 0 || l+n < 0) {
			
		return false;
		
	}
	if (k+m > 7 || l+n > 7) {
		return false;
		
		
	}
				
	else 
			
		return true;
	}


	
public static void main (String[] args)	{	//Create movements and shuffle for random movement from the ant 
	List<Integer> average =  new ArrayList<Integer>();
	
	for (int a = 0; a<10; a++) {
	
	List<Integer> counting =  new ArrayList<Integer>();
	
		
		int number = 0;
		int total = 0;		
		int k = (int) ((Math.random() * 7)); //0
		int l = (int) ((Math.random() * 7));//1		
		
		
		while (number< 64) {
			for (int i = 0; i < counting.size(); i++) {
		        for (int j = i + 1; j < counting.size(); j++) {
		            if (counting.get(i) == counting.get(j)) {
		                counting.remove(j);
		                j--;
		            }
		        }
		    }	
		number = counting.size();
		int [] move = ants();
		int m = move [0]; //-101
		int n = move [1];
		
		
		//find out if the move is legal
		
		boolean ok = legalMove( k,  l,  m,  n);//if method legalMove returns 
					
		if (ok == false) {		
			
			
		}
		
		if (ok == true) {	   
			k = k+m;
			l = l+n;
			total++;
			counting.add(chessBoard(k, l)); 
			 		
		}				
		
		
		
		}
		
		Collections.sort(counting);//for printing all squares visited in order nice to see if one was missing
		average.add(total);
		System.out.println("The ant took: " + total + " steps."); 
	}
	    int average1 = 0;
	    
	    for (int i = 0; i<average.size(); i++) {
	    	average1 += average.get(i);
	    }
	    int averagefinal = average1/average.size();
	    
	    System.out.println("The ant took " + averagefinal + " steps on average.");
}
}




