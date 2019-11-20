package hk222su_assign2;

import java.util.Scanner;

public class SimpleTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter positive integer ");
		int number = input.nextInt();
		//set few int to work with in the loop and nested loops
		int i;
		int j;
		int k;
		
		if(number >= 0) {
		//First loop - run it as many times as the chosen number. Count iterations by i++
		for(i=0; i<number; i++) 
			{ 
            /*since I need space before - this loop has to print 
             * space as often as i (that will eventually equal number)            
             */
            for (k=0; k<i; k++) {
                System.out.print(" "); 

            }
            /*Then it is to count/print stars needed here I print in reverse
             *order from spaces - that is first iteration is repeated number
             *times before loop brakes.*/
            for(j=number; i<j; j--) 
            { 
                 
                System.out.print("*"); 
            } 
              
            //line brake between iterations
            System.out.println(); 
		
			}
		}
		
		else
			System.out.print("Input not valid. Please, enter possitive number");
		
	input.close();
	
}
}