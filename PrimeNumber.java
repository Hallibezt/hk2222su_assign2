package hk222su_assign2;
import java.util.Scanner;

public class PrimeNumber {


	
	
public static boolean prime(int number) {
	
		int count = 2;
		
		
		while (count <= number)			{
			
			if (number % count == 0) 		
				
				
				if (count != (number)) 
					return false;
					
					
				else 
					return true;					
			
	
			else
				count++;
		}
		return false;
}
			
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
	
	
	int forever = 1;
	
	while (forever == 1) {
	
	
	System.out.print("Please enter number");
	int number = input.nextInt();
	
	if (number < 0) {
		System.out.println("You have quit this game");
		break;}
	
	else if(prime(number))
		
			System.out.println("This is a prime");
		else
			System.out.println("This is not a prime");
	}
	

	input.close();



}
	

}
