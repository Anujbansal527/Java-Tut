import java.time.*;
import java.time.format.DateTimeFormatter;

public class demo {
     
public static void LocalDateTimeApi()
{
  
    // the current date
    LocalDate date = LocalDate.now();
    System.out.println("the current date is "+date);
  
  
    // the current time
    LocalTime time = LocalTime.now();
    System.out.println("the current time is "+ time);
      
  
    // will give us the current time and date
    LocalDateTime current = LocalDateTime.now();
    System.out.println("current date and time : "+current);
  
  
    // to print in a particular format
    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
   
    String formatedDateTime = current.format(format);  
    
    System.out.println("in formatted manner "+ formatedDateTime);
  
  
    // printing months days and seconds
    Month month = current.getMonth();
    int day = current.getDayOfMonth();
    int seconds = current.getSecond();
    System.out.println("Month : "+month+" day : "+ day+" seconds : "+seconds);
  
    // printing some specified date
    LocalDate date2 = LocalDate.of(1950,1,26);
    System.out.println("the republic day :"+date2);
  
    // printing date with current time.
    LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
 
    System.out.println("specific date with "+"current time : "+specificDate);
}
 
    public static void main(String[] args) {
        LocalDateTimeApi();
    }    
}



/*
Java 8 Date/Time API
Java has introduced a new Date and Time API since Java 8. The java.time package contains Java 8 Date and Time classes.

java.time.LocalDate class
java.time.LocalTime class
java.time.LocalDateTime class
java.time.MonthDay class
java.time.OffsetTime class
java.time.OffsetDateTime class
java.time.Clock class
java.time.ZonedDateTime class
java.time.ZoneId class
java.time.ZoneOffset class
java.time.Year class
java.time.YearMonth class
java.time.Period class
java.time.Duration class
java.time.Instant class
java.time.DayOfWeek enum
java.time.Month enum


Classical Date/Time API
But classical or old Java Date API is also useful. Let's see the list of classical Date and Time classes.

java.util.Date class
java.sql.Date class
java.util.Calendar class
java.util.GregorianCalendar class
java.util.TimeZone class
java.sql.Time class
java.sql.Timestamp class
*/
