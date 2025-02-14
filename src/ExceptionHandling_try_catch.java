import java.util.Scanner;

public class ExceptionHandling_try_catch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      ExceptionHandling_try_catch etc = new ExceptionHandling_try_catch();
        System.out.println("Your input");
            try {
                for (int i = 0; i < 4; i++) {

                int j = sc.nextInt();
                System.out.println("correct input :)");

            }
        }
        catch (Exception e) {
            System.out.println(e);
                System.err.println("please enter valid input :(");
            }



    }

}
