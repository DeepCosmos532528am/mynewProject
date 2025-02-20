// One method

import java.util.Scanner;


class Exception_operationInvalid extends Exception {
    @Override
    public String toString() {
        return "ExceptionOccurred: Operation Invalid!";
    }
}

class Exception_divisionByZero extends Exception {
    @Override
    public String toString() {
        return "ExceptionOccurred: Cannot divide by Zero!";
    }
}

class Exception_outOfRange extends Exception {
    @Override
    public String toString() {
        return "ExceptionOccurred: Greater values!!";
    }

}


class myExceptions {
    Scanner sc = new Scanner(System.in);

    public int myCustom_Operational_Exceptions(int a, String c, int b) throws Exception_operationInvalid, Exception_divisionByZero, Exception_outOfRange {
        String c1 = c;
        int result = 0;

        if (!c1.equals("*") && !c1.equals("-") && !c1.equals("+") && !c1.equals("/")) {
            throw new Exception_operationInvalid();

        } else if (b == 0 && c1 == "/") {
            throw new Exception_divisionByZero();
        } else if (a > 100000 || b > 100000) {
            throw new Exception_outOfRange();
        } else if ((a > 7000 || b > 7000) && c1.equals("*")) {
            throw new Exception_outOfRange();
        } else {
            result = (c1.equals("+")) ? a + b : (c1.equals("-")) ? a - b : (c1.equals("*")) ? a * b : (c1.equals("/")) ? a / b : 0;
            return result;
        }



    }

}

public class ExceptionHandling_Exercise_CustomCalculator {
    public static void main(String[] args) throws Exception_operationInvalid, Exception_divisionByZero, Exception_outOfRange {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("Operator = ");
        String c = sc.next();

        System.out.print    ("b = ");
        int b = sc.nextInt();


        System.out.println("Your input");
        myExceptions my = new myExceptions();
        try {
            int answer = my.myCustom_Operational_Exceptions(a, c, b);
            System.out.printf(" %d %s %d : " + answer, a,c,b);

        } catch (RuntimeException e) {
            System.err.println(e);


        }





       /* try {
            for (int i = 0; i < 4; i++) {

                int j = sc.nextInt();
                System.out.println("correct input :)");

            }
        }
        catch (Exception e) {
            System.out.println(e);
            System.err.println("please enter valid input :(");
        */


// Second method


/* import java.util.Scanner;

class Exception_operationInvalid extends Exception {
    @Override
    public String toString() {
        return "ExceptionOccurred: Operation Invalid!";
    }
}

    class Exception_divisionByZero extends Exception {
        @Override
        public String toString() {
            return "ExceptionOccurred: Cannot divide by Zero!";
        }
    }

        class Exception_outOfRange extends Exception {
            @Override
            public String toString() {
                return "ExceptionOccurred: Greater values!!";
            }

        }


        class myExceptions {
            Scanner sc = new Scanner(System.in);

            public int myCustom_Operational_Exceptions(int a, String c, int b) throws Exception_operationInvalid
            {
                String c1 = c;
                int result = 0;
                try {
                    if (!c1.equals("*") && !c1.equals("-") && !c1.equals("+") && !c1.equals("/")) {
                        throw new Exception_operationInvalid();

                    } else if (b == 0 && c1 == "/") {
                        throw new RuntimeException("Cannot divide by zero!");
                    } else if (a > 100000 || b > 100000) {
                        throw new RuntimeException("Numbers too Large!");
                    } else if ((a > 7000 || b > 7000) && c1.equals("*")) {
                        throw new RuntimeException(" multiplier cannot be grater then 7000");
                    } else {
                        result = (c1.equals("+")) ? a + b : (c1.equals("-")) ? a - b : (c1.equals("*")) ? a * b : (c1.equals("/")) ? a / b : 0;
                        return result;
                    }

                } catch (RuntimeException e) {
                    System.err.println(e);
                    return myCustom_Operational_Exceptions(sc.nextInt(), sc.next(), sc.nextInt());

                }

            }

        }

        public class ExceptionHandling_Exercise_CustomCalculator {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Your input");

                myExceptions my = new myExceptions();
                int answer = my.myCustom_Operational_Exceptions(2, "/", 1);
                System.out.println("Your answer is : " + answer);
       /* try {
            for (int i = 0; i < 4; i++) {

                int j = sc.nextInt();
                System.out.println("correct input :)");

            }
        }
        catch (Exception e) {
            System.out.println(e);
            System.err.println("please enter valid input :(");
        }*/


    }
}