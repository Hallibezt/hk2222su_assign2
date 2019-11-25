package hk222su_assign2;

import java.util.Scanner;

public class Palindrome {
	
	
	public static boolean palindrome(String check) {
		
		
		String lowerCheck = check.toLowerCase();
		String check2 = lowerCheck;
		check2 = check2.replaceAll("\\s", "");
				
		
		int low = 0;
		int high = check2.length()-1; 
		
		
		while (low < high) {			
			
			
			   if (check2.charAt(low)!= check2.charAt(high))
			   {
				   return false;
				   //If not the same no need to finish comparison, break the loop				  				
			   }
			low++;
			high--;
			
		  }
		
			
		      return true;   
		}
    

public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Please, enter a word to see if it is a palindrome: ");
	String check = input.nextLine();
	int run = 1;
	
	while (run == 1) {
	if (check.equals("stop"))
		break; 
	
	if(palindrome(check))
		System.out.print("This is a palindrome");
	else
		System.out.print("This is not a palindrome");
	
	}
	System.out.print("You stopped the application");

	
	input.close();



}
	
}
		

	
	  
	
	

	

