package hk222su_assign2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter positive integer ");
		int number = input.nextInt();
		int i;
		int j;
		int k;		
		int m;
		
		for (i=0; i<=number; i++) {
			
		
			
			/*and the other way around - just skip last piece
			- so we don't get two 9 star lines*/

			for (k=0; k < i; k++) {
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
			
		//  spaces decrese by 1
		// while stars increase by 2
		// When input number is reached 
		//thing turn around untill star = 1
		//This loop is broken and I can add number for the outer most loop
		//if positive start working nested loops back in
		// if negative quit all loops and game
		
	input.close();
	
	}

}

	
	
	