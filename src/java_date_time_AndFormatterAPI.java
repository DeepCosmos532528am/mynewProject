import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class java_date_time_AndFormatterAPI {

    public static void main(String[] args) {
           LocalDate d = LocalDate.now();
           System.out.println(d);

           LocalTime t  = LocalTime.now();
           System.out.println(t);

           LocalDateTime dt = LocalDateTime.now();
           System.out.println(dt);

           DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");// See the Variation,
           DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d/M/yy --E a");// See the Variation,
           DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd+MM+yyyy ");// See the Variation
           DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE;// See the Variation
        // Similary here, we can use mm for milliSeconds and HH for hours and so on...

        // Can refer to this Link for more usable classes and pacakages about it  https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/time/format/DateTimeFormatter.html

        // String myDate = t.format(dtf);  // in this I am telling to bring the LocalDatetime dt into the format dtf that I have
        // passed in the parameter in the dtf Formatter

           System.out.println(dt.format(dtf));
           System.out.println(dt.format(dtf1));
           System.out.println(dt.format(dtf2));
           System.out.println(dt.format(dtf3));


    }

}
