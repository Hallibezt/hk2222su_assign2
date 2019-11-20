package hk222su_assign2;

import java.text.NumberFormat;
import java.util.Scanner;


public class DangerousWork {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How much money do you want to earn "
				+ "in Swedish krona?");
		System.out.print("Amount in kronar: ");
		int money = input.nextInt();		
		money = money * 1000;		
		int days = 1;
		double salary = 0.02;	
		if (days > 30) {
			System.out.print("Sorry this job was to dangerous and you died");		 				
		}	
		while (salary < money) {
			salary = salary * 2;		
			days++;
					
		}
		//Said in assignment I would probably not surviv more than 30 days so:
		if (days > 30) {
			salary = Math.round(salary / 1000);
			//Use NumberFormat method to give answer in money format - looks better ;)
			String salary2 = NumberFormat.getInstance().format(salary);
			System.out.println("Sorry this job was to dangerous and you died, ");		 				
		    System.out.println("but your widdow gets the amount of " + salary2 + " kr.");		 				
		}
		else 
			System.out.print("You will have to work for " + days + " days");
		input.close();
	}
}
	
