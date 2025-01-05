import java.util.Scanner;

public class ExceptionHandling_ErrorsInJava {
    public static void main(String[] args) {

        // Syntax errors
        /*
        int a = b;
        b =0
        */

        //Logical errors
        // Here just I am thinking that the logic is correct to get the desired output but the logic is not correct to get teh desired output

        for (int i = 1; i<5 ; i++ ){
            System.out.println(2*i+1);
        } // Here I think the logic will print the prime numbers but the logic becomes wrong when it print 9 at the end

        // Runtime errors
Scanner sc = new Scanner(System.in);
int i = sc.nextInt();
 // if input is out of rannge or if data type of user input does not match int type then runtime error


    }
}
