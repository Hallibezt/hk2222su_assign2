package hk222su_assign2;

import java.util.Scanner;

public class DateFormat {
	
	public static String format(String format1,String day, String year, String month) {
		
		
		
		if (format1.equals("big-endian")) {					 
		format1 = year + "." + month + "." + day;	
		
		return format1;
		}
		
		else if (format1.equals("little-endian")) {			
			format1 = day + "." + month + "." + year;
			return format1;
		}
		
			
		else if (format1.equals("mid-endian")) {			
			
			format1 = month + "." + day + "." + year;
			return format1;
		}
		else
		
		format1 = "Wrong input";
		return format1;
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter year: ");
			String year = input.next();
		System.out.println("Please, enter month: ");
			String month = input.next();
			if (month.length()< 2)
				month = "0"+month;
		System.out.println("Please, enter day: ");		
			String day = input.next();
			if (day.length()< 2)
				day = "0"+day;
		
		System.out.println("Please, enter date format: "
				+ "\"big-endian\" for YYYY/MM/DD,"
				+ " \"little-endian\" for DD/MM/YYYY or"
				+ " \"mid-endian\" for MM/DD/YYYY");		
	    
			String format1 = input.next();
	
		
			
			System.out.print(format(format1,  day,  year,  month));
		
		
		
	 input.close();
	}
	}
	
	
	
	
	
