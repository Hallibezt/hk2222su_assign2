package hk222su_assign2;

import java.util.Scanner;

public class Histogram {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	String star1 = "";
	String star2 = "";
	String star3 = "";
	String star4 = "";
	String star5 = "";
	String star6 = "";	
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
	int sum4 = 0;
	int sum5 = 0;
	int sum6 = 0;
	int count = 0;
	
	while (count < 500) {
		int roll= (int) (Math.random() * ((6-1) + 1)) + 1;		
		
		if(roll == 1) {
				sum1++;
				star1 += "*";
		}
			
		
		if (roll == 2) {
			sum2++;
			star2 += "*";
			}
		
		if (roll == 3) {
			sum3++;
			star3 += "*";
			}
		
		if (roll == 4) {
			sum4++;
			star4 += "*";
			}
		
		if (roll == 5) {
			sum5++;
			star5 += "*";
			}
		
		if (roll == 6) {
			 sum6++;
			 star6 += "*";
			 }
								
	
	
		count++;
	}
	
	System.out.println (sum1 + star1);
	System.out.println (sum2 + star2);
	System.out.println (sum3 + star3);
	System.out.println (sum4 + star4);
	System.out.println (sum5 + star5);
	System.out.println (sum6 + star6);
	input.close();
	}
}
