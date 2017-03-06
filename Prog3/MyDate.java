package Prog3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyDate {
	
	private LocalDate day;
	private LocalDate month;
	private LocalDate year;
	DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
	DateTimeFormatter format3 = DateTimeFormatter.ofPattern("DDD yyyy");
	
	MyDate(int month, int day, int year){
		
	}
	MyDate(String month, int day, int year ){
		//this.month = LocalDate.
	}
	MyDate(int dayOfYear, int year ){
		
	}
    MyDate(){
    	System.out.println("Nothing");
    }
	
}
