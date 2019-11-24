package hk222su_assign2;

import java.util.Scanner;

public class CalcNumbers {
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please, enter integers - then enter 0 to quit and sum them up");
	int count = 1;
	System.out.print(count + ". numer is: ");
	int first = input.nextInt();
	int sum = first;	
	
	while (first !=0) {
		count++;
		System.out.print(count + ". numer is: ");
		int nr = input.nextInt();		
		first = nr;
		sum += nr;		
	}
	
	System.out.print("The sum is: " + sum);
	
	input.close(); 
 }
}


