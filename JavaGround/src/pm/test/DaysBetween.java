package pm.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysBetween {
	public static int daysBetweenDates(String date1, String date2) {
	    LocalDate temp;
	    
			
		//Parsing the date
		LocalDate dateBefore = LocalDate.parse(date1);
		LocalDate dateAfter = LocalDate.parse(date2);
	        
	        if(dateAfter.isBefore(dateBefore))
	        {
	            temp = dateBefore;
	            dateBefore = dateAfter;
	            dateAfter = temp;
	        }
			
		//calculating number of days in between
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
			
	    return (int)noOfDaysBetween;
	    }
	
	public static void main(String[] args) {
		String date1 = "2020-01-15";
		String date2 = "2019-12-31";
	   System.out.println(daysBetweenDates(date1, date2));
	}
	
}
