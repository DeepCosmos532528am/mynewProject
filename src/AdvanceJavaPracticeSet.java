import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class AdvanceJavaPracticeSet {
    public static void main(String[] args) {

        // Question 1 : Store the names of 10 students in ArrayList and print them using for each loop
        ArrayList arL = new ArrayList();
        arL.add("Student1");
        arL.add("Student2");
        arL.add("Student3");
        arL.add("Student4");
        arL.add("Student5");
        arL.add("Student6");
        arL.add("Student7");
        arL.add("Student8");
        arL.add("Student9");
        arL.add("Student10");


        for( Object obj : arL){  // As here the variable data-type is Object so , it can just hold the data but will not let the value to perform any operation , without type Casting
            System.out.println(obj + "sachin ");

    }
        // Question 2 : Print the time in the format HH/MM/SS
        Date d = new Date();
        System.out.println(" The time is : " + d.getHours() +":"+ d.getMinutes() +":"+ d.getSeconds());


        // Question 3 : do question 2 using Calender class
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.HOUR) +":"+ c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND));


        // Question 4 : do question 2 using Java.timeAPI
        LocalTime llt = LocalTime.now();
        DateTimeFormatter dF = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(dF.format(llt));

        // Question 5
        HashSet <Integer> hs = new HashSet<>();
        hs.add(2);
        hs.add(12);
        hs.add(12);
        hs.add(9);
        hs.add(2);
        hs.add(20);
        System.out.println(hs);
    }
}
