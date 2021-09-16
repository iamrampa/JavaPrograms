package Java_newversion_concepts;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public class Localdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1=LocalDate.now();
		System.out.println(d1);
         
		LocalTime t1=LocalTime.now();
		System.out.println(t1);
		
		LocalDate d2=LocalDate.of(1999,10,30);
		System.out.println(d2);
		
		LocalDate d3=LocalDate.parse("1999-10-30");
		System.out.println(d3);
		
		DateTimeFormatter df= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d4=LocalDate.parse("30-10-1999",df);
		System.out.println(d4);
		ZonedDateTime zd1=ZonedDateTime.now();
		System.out.println(zd1);
		
		
		
		LocalTime l2=LocalTime.now(ZoneId.of("Asia/Calcutta"));
		System.out.println(l2);
	}

}
