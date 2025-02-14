import java.util.Calendar;
import java.util.TimeZone;

public class CalenderClass_in_Java {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); // Calender is the abstract class so cannot create its obj
        // that's why the getInstance , which is the concrete class used to implement it through the Gregorian-Calender from the Local OS System
        // And the object of the concrete class can be made !
        System.out.println(cal.getFirstDayOfWeek());
        System.out.println(cal.getCalendarType());
        System.out.println(cal.getTimeZone());
        System.out.println(cal.getTimeZone().getID());

        Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dubai"));
        System.out.println(cal2.getFirstDayOfWeek());
        System.out.println(cal2.getCalendarType());
        System.out.println(cal2.getTimeZone());
        System.out.println(cal2.getTimeZone().getID());
        cal2.setWeekDate(2005, 54, Calendar.TUESDAY);
        System.out.println(cal.getWeekYear());
        //.
        //.
        //.
        // and many more are there , see Documentation on https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Calendar.html#DAY_OF_WEEK
    }
}
