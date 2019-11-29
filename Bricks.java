package hk222su_assign2;

import java.util.*;

public class Bricks {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
	
	int loop= 1;
	
	while (loop ==1) {
	System.out.println("Please, enter lego brick height and width (enter negative number to quit): ");
	int k = input.nextInt();
	if (k < 0) {
		break;
	}
	
	int l = input.nextInt();	
	if (l < 0) {
		break;
	}
	
	int m = 0;
	
	if (l>k) 
		 m = (l-k);
	if (l<k) 
		 m = (l-k);
	if (l==k)
		 m = 0;
	
	System.out.print("Here is your brick ");
	for(int i = 0; i <lego(k,l).length ; i++) {
		System.out.println("");
		for( int j = 0; j < lego(k,l).length + m; j++) {
			System.out.print(lego(k,l) [i][j]);
		}		
	}
	
	System.out.println(""); 
	}
	System.out.println("finish"); 
	input.close();
	
	
	}	
	
	
	
	public static String [][] lego(int k, int l){
	
	//To fix the size of column for second loop
	int m = 0;
	
	if (l>k) 
		 m = (l-k);
	if (l<k) 
		 m = (l-k);
	if (l==k)
		 m = 0;
	
	String [][] builder = new String [k+2][l+2];
	//upper part
	builder [0][0]= "\u250F";
	for (int g = 1; g < l+1; g++) {
		builder[0][g]="\u2501";}	
	builder [0][l+1]= "\u2513";
	
	//middle part
	for(int i = 1; i < builder.length; i++) {
		builder[i][0]="\u2503";
		builder[i][l+1]="\u2503";
		for( int j = 2; j < builder.length + m; j++) {
			builder[i][j-1]="\u2022";
		}
	  }
	
	//Lower part
	builder [k+1][0]= "\u2516";
	for (int g = 1; g < l+1; g++) {
		builder[k+1][g]="\u2501";}
	builder [k+1][l+1]= "\u251B";
	
	return builder;
	
	}
}
