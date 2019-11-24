package hk222su_assign2;

import java.util.Scanner;

public class BirthdayCandles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;			
		int candelneeded = 0;	
		int candelgot = 0;
		int box = 0;
		
		
		while ( age< 100) {	
			
			age++;		
			candelneeded++;
			 
			int count = 0;
			while (candelgot < candelneeded)
			{
				candelgot += 24;
				box++;
				
				count++;
				
			}
			System.out.print("My age is " + age + " I need " );
			if (count >0)
			System.out.println(" to buy " + count + " box/es.");
				   
			else   
				System.out.println("no candels, got enough.");
			candelgot = candelgot - candelneeded;		
			
			
			
			}
		
		System.out.println("");
		System.out.print("I bought totally " + box + " boxes and got " + candelgot + " left.");
		
		input.close();	
	}
}
