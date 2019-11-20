package hk222su_assign2;

import java.util.Scanner;

public class EveryOther {

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two integers");
		int first = input.nextInt();
		int last = input.nextInt();	
		
		do {System.out.print(first + " ");
		first = first + 2;
		}
		while (first <= last);
		
		input.close();
		
		
 }
}