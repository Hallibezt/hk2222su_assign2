package hk222su_assign2;

import java.util.Scanner;

public class Password {
	
public static String password(String password) {
	int countTwo = 0;
	int countSymbol = 0;	
	
	if (password.length()<10) {
		password = "Has to be at least 10 characters";
		return password;}
	else	
		for (int i = 0; i < password.length(); i++){
		    char c = password.charAt(i);     
		    if (Character.isUpperCase(c)) {		    		  
		        countTwo++;} 
		    }
	if (countTwo<2) {
		password = "You need at least two upper cases";
		return password;}
	
	
	for (int i = 0; i < password.length(); i++){
	    char c = password.charAt(i);    
	   
	      if (Character.isLetter(c)== false) {	 
	    	  countSymbol++;  	 
      		 }   	  
	}
	if (countSymbol <2) {
		password = "You need at least two special character";
		return password;}
	
	else
		password = "Valid password";
		return password;
		
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int stopp = 1;
		System.out.println("Password has to have: 10 characters, two upper cases and two symbols, at least.");
		System.out.println("");
		while (stopp == 1) {
		System.out.println("Please enter password: ");
		String password = input.next();	
	
		if (password(password)== "Valid password")
			break;
		
		System.out.println(password(password));	 		
			
				 
		}
		
		System.out.print("This password works well");
		
		input.close();
		
	   }
	}

