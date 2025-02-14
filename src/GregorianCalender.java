import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalender {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/GregorianCalendar.html
        System.out.println("H");
        GregorianCalendar gre = new GregorianCalendar();

        System.out.println(
               gre.isLeapYear(2008)
        );
        for (int a = 0; a < 631; a++) {
            System.out.println(
                    TimeZone.getAvailableIDs()[a]
            );
            // And  many more, refer to the CWH video or docs :: https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/GregorianCalendar.html
        }
    }
}
