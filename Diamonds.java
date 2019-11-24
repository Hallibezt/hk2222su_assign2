package hk222su_assign2;

import java.util.Scanner;

public class Diamonds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter positive integer ");		
		int i;
		int j;
		int k;		
		int m;	
		int num = 1;
		while (num > 0) {			
			int number = input.nextInt();
			
		for (i=0; i<=number; i++) {
			
			for (k=number; k > i; k--) {
                System.out.print(" "); 
            }
			
			for(j=0; j<i; j++) 
            { 
                 
                System.out.print("*"); 
            } 
			
			for(m=1; m<i; m++) 
            { 
                 
                System.out.print("*"); 
            } 					
			
			System.out.println();   		
		}		
		/*print another loop for the lower part, just the other way around,
		but just one less iteration so I do not repeat last star line*/
		for (i=0; i<=number; i++) {
			for (k=-1; k < i; k++) {
		        System.out.print(" "); 
		    }
			
			for(j=number-1; j>i; j--) 
		    { 
		         
		        System.out.print("*"); 
		    } 
			
			for(m=number-2; m>i; m--) 
		    { 
		         
		        System.out.print("*"); 
		    } 			
			
			System.out.println();   		
		}	
		num = number;
	}			
		
		
	input.close();
	
	}
}

