import java.util.Date;


public class DateClass_in_Java {
    public static void main(String[] args) {
        Date date = new Date();
       // Most of them are now deprecated from java 8 onwards , now java.time package is used for such time related work        // only some are non deprecated, I can check them by typing the code
        System.out.println(date);
        System.out.println(date.getTime()); // In milliSecs Since 1 january 1970
        System.out.println(date.getDay()); // deprecated
        System.out.println(date.getYear()); // deprecated
        System.out.println(date.getDate()); // deprecated
        System.out.println(date.getSeconds()); // deprecated
        System.out.println(date.getTimezoneOffset()); // deprecated
    }
}
