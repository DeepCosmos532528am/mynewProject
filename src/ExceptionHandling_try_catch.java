import java.util.Scanner;

public class ExceptionHandling_try_catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      ExceptionHandling_try_catch etc = new ExceptionHandling_try_catch();
       /* System.out.println("Your input");
            try {
                for (int i = 0; i < 4; i++) {

                int j = sc.nextInt();
                System.out.println("correct input :)");

            }
        }
        catch (Exception e) {

                System.err.println("please enter valid input :(");
            }*/

        try{
            System.out.println("in try ");
            int lo = etc.err(8,0);
            System.out.println(lo);
        }finally {
            System.out.println("This is finally block");
        }

        System.out.println("out of block ");

    }
      static int err(int a, int b ) throws ArithmeticException{
       int f =  a/b;
        return f;

    }
}
