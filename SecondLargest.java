package hk222su_assign2;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*In this program I wanted to make the change between input numbers
		 * as easy as possible. If you want to change how many integers the user should use
		 * only thing needed is to put new desired number in the string (instead of 10) and lower or
		 * higher the number in the while statement. Just remember that I have already two numbers
		 * before the while statement so if you want 12 numbers ; count<10 should be in while statement.
		 * Think it is hard to make the change easier
		 */
	
		System.out.println("Please, enter 10 integers: ");
		/*First I ask user for two numbers that will become the upper and lower limit
		 * guess I could use Integer.Min/max to do this and avoid the problem if he puts in same number tvice
		 */
		int first = input.nextInt();			
		int second = input.nextInt();
		// Started two integers to be able to move numbers between two places without overwriting them
		int first1;
		int second2;
		
		//Two numbers have been given - now it just to set the higher number in first place and lower in second
		if (second >first) {
			first1=second;
			second2=first;
		}
		else {
			first1=first;
			second2=second;		
		}
		/*I set count to control how many loops I want to run and
		 * that is how I control how many numbers I want the user to 
		 * put in count - 2 (because he already put in two) = numbers to compare.  
		 */
		
		int count = 0;	
		while ( count < 8) {
			int number = input.nextInt();
			/*Well first - if the number is smaller than both first two nothing changes and the number can just disappear
			 * but if it is smaller than first but bigger that second I want it to take seconds place 
			 * and kick the former out forever - that is what I do in else if part
			 * tricky part if its bigger than both - then I need the first to take second place and new number take first
			 * that is what I do here in if part
			 */
			if (number>first1){
				second2=first1;
				first1=number;
			}
			
			else if (number > second2){								
				second2=number;
			 }
			
			count++;
		}		
		
		System.out.println("Second largest number is: " + second2); 
		
		input.close();
		
	}	
}

